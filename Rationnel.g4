//membre 1: Yanis BELDJILALI (22314105)
//membre 2: M'hena AMMOUR (22313564)
//membre 3: Ouiza SADI OUFELLA (22312789)

grammar Rationnel;

@header {
    import java.util.HashMap;
}

@parser::members {

    HashMap<String, String> typesTable = new HashMap<String, String>();
    HashMap<String, Integer> AddressTable = new HashMap<String, Integer>();
    int varAddressCounter = 0;
    int sp = 0;
    int labelCounter = 0;

    public int createLabel(){
        labelCounter +=1;
        return labelCounter;
    }

    public String pgcdCode(){
        int[] labelArray = new int[5];

        for (int i = 0; i < 5; i++) {
            labelArray[i] = createLabel();
        }

        String code = "LABEL " + String.valueOf(labelArray[0]) 
            + "\nDUP \nPUSHI 0 \nSUP \nJUMPF " 
            + String.valueOf(labelArray[2]) + "\nLABEL " 
            + String.valueOf(labelArray[1]) + "\nPUSHG " 
            + String.valueOf(sp-2) + "\nPUSHG " 
            + String.valueOf(sp-1) + "\nSUB\nPUSHG " 
            + String.valueOf(sp-1) + "\nSTOREG " 
            + String.valueOf(sp-2) + "\nSTOREG " 
            + String.valueOf(sp-1) + "\nJUMP "
            + String.valueOf(labelArray[0]) + "\nLABEL "
            + String.valueOf(labelArray[2]) + "\nDUP\nPUSHI 0\nNEQ\nJUMPF "
            + String.valueOf(labelArray[4]) + "\nLABEL " 
            + String.valueOf(labelArray[3]) + "\nPUSHI -1\nMUL\nJUMP "
            +String.valueOf(labelArray[1]) + "\nLABEL "
            + String.valueOf(labelArray[4]) + "\nPOP\n";
        return code;
    }

    public String ppcmCode(){

        String code = "DUP\nPUSHG " ;
        moveSp(2);
        code += String.valueOf(sp-4) + "\n" + pgcdCode() +"PUSHG "
        + String.valueOf(sp-4) +  "\nPUSHG "
        + String.valueOf(sp-3) + "\nMUL\nSTOREG " 
        + String.valueOf(sp-4)+ "\nSTOREG " 
        + String.valueOf(sp-3) + "\nDIV\n";
        moveSp(-2);
        return code;
    }

    public String prcntgCode(){

        String code = "PUSHG " ;
        code += String.valueOf(sp-2) + "\nPUSHI 1000\nMUL\nSTOREG " 
        + String.valueOf(sp-2) + "\nDIV\nPUSHI 10\n" + entierplproche();
        return code;
    }

    public void displayCode(String code) {
        System.out.println(code);
    }

    public void moveSp(int n) {
        sp += n;
    }
    
    public String initVariable(String variable, String variableType) {
        
        String code = new String();
        int variableAddress = varAddressCounter;

        if (typesTable.containsKey(variable)) {
            throw new RuntimeException("Variable '" + variable + "' has been already declared.");
        } else {
            AddressTable.put(variable, variableAddress);
            typesTable.put(variable, variableType);

            switch (variableType) {
                case "int":
                case "bool":
                    code = "PUSHI 0\n";  
                    varAddressCounter++;
                    moveSp(1);
                    break;
                case "rationnel":
                    code = "PUSHI 0\nPUSHI 1\n";  
                    varAddressCounter = varAddressCounter + 2;
                    moveSp(2);
                    break;
                default:
                    throw new RuntimeException("Error: Unsupported variable type : " + variableType );
            }
        }
        return code;
    }

    public String assignCode(String variable, String type, String value) {

        String code = new String();
        if (typesTable.containsKey(variable)) {
            if(isTypeCompatible(variable, type)) {
                switch(type) {
                    case "bool":
                    case "int":
                        code = value + "STOREG " + String.valueOf(AddressTable.get(variable)) + "\n";
                        moveSp(-1);
                        break;
                    case "rationnel":
                        code = value + "STOREG " + String.valueOf(AddressTable.get(variable)+1) + "\nSTOREG " + String.valueOf(AddressTable.get(variable))+"\n";
                        moveSp(-2);
                        break;
                    default :
                        break;
                }
            } else {
                throw new RuntimeException("type of '" + variable + "' is not " + type);
            }
        } else {
            throw new RuntimeException("Variable '" + variable + "' is not declared.");
        }
        return code;
    }

    public String getVariableType(String variableName) {
        return typesTable.get(variableName);
    }

    public Integer getAddress(String variableName) {
        return AddressTable.get(variableName);
    }

    public boolean isTypeCompatible(String variable, String type) {
        String variableType = getVariableType(variable);
        if (variableType == null) {
            throw new RuntimeException("Variable '" + variable + "' is not declared.");
        }

        switch (type) {
            case "int":
            case "rationnel":
            case "bool":
                return variableType.equals(type);
            default:
                throw new RuntimeException("Type " + type + "does not exist.");
        }
    }

    public String simCode(){
        
        String code ="DUP\nPUSHG " + String.valueOf(sp-2)+"\n";
        moveSp(2);
        code += pgcdCode() + "PUSHG "
            + String.valueOf(sp-4) + "\nPUSHG "
            + String.valueOf(sp-2) + "\nDIV\nSTOREG " 
            + String.valueOf(sp-4) + "\nDIV\n" ;

        moveSp(-2);
        return code;
    }

    public String additionCode(){
        String code = "DUP\nPUSHI 0\nPUSHR " 
            + String.valueOf(sp-4) + "\nMUL\nPUSHI 0\nPUSHR " 
            + String.valueOf(sp-2) + "\nPUSHI 0\nPUSHR "
            + String.valueOf(sp-3) + "\nMUL\nADD\nPUSHI 0\nPUSHR "
            + String.valueOf(sp-3) + "\nPUSHI 0\nPUSHR " 
            + String.valueOf(sp-1) + "\nMUL\nSTOREG " 
            + String.valueOf(sp-3) + "\nSTOREG "
            + String.valueOf(sp-4) + "\nPOP\nPOP\n";
         
        return code;     
    }

    public String subCode(){
        String code = "DUP\nPUSHI 0\nPUSHR " 
            + String.valueOf(sp-4) + "\nMUL\nPUSHI 0\nPUSHR "
            + String.valueOf(sp-2) + "\nPUSHI 0\nPUSHR "
            + String.valueOf(sp-3) + "\nMUL\nSUB\nPUSHI 0\nPUSHR "
            + String.valueOf(sp-3) + "\nPUSHI 0\nPUSHR"
            + String.valueOf(sp-1) + "\nMUL\nSTOREG "
            + String.valueOf(sp-3) + "\nSTOREG "
            + String.valueOf(sp-4) + "\nPOP\nPOP\n"; 
        return code;     
    }

    public String multCode(){
        String code = "PUSHI 0\nPUSHR "
            + String.valueOf(sp-3) + "\nMUL\nPUSHI 0\nPUSHR " 
            + String.valueOf(sp-2) + "\nPUSHI 0\nPUSHR " 
            + String.valueOf(sp-4) + "\nMUL\nSTOREG "
            + String.valueOf(sp-4) + "\nSTOREG "
            + String.valueOf(sp-3) + "\nPOP\n" ; 
        return code;     
    }
 
    public String divCode(){

        String code = "PUSHI 0\nPUSHR "
            + String.valueOf(sp-4) + "\nMUL\nPUSHI 0\nPUSHR "
            + String.valueOf(sp-2) + "\nPUSHI 0\nPUSHR "
            + String.valueOf(sp-3) + "\nMUL\nSTOREG "
            + String.valueOf(sp-3) + "\nSTOREG "
            + String.valueOf(sp-4) + "\nPOP\n";

        return code;
    }

    public String puissanceCode(){
        int[] labelArray = new int[3];

        for (int i = 0; i < 3; i++) {
            labelArray[i] = createLabel();
        }

        String code = "PUSHG  "
            + String.valueOf(sp-3) + "\nPUSHG "
            + String.valueOf(sp-2) + "\nLABEL "
            + String.valueOf(labelArray[0]) + "\nPUSHG  "
            + String.valueOf(sp-1) + "\nPUSHI  1\nSUB\nPUSHI  0\nSUP\nJUMPF "
            + String.valueOf(labelArray[2]) + "\nLABEL"
            + String.valueOf(labelArray[1]) + "\nPUSHG "
            + String.valueOf(sp+1) + "\nPUSHG "
            + String.valueOf(sp-2) + "\nMUL\nSTOREG "
            + String.valueOf(sp+1) + "\nPUSHG "
            + String.valueOf(sp-3) + "\nPUSHG  "
            + String.valueOf(sp) + "\nMUL\nSTOREG  "
            + String.valueOf(sp) + "\nPUSHG  " 
            + String.valueOf(sp-1) + "\nPUSHI 1\nSUB\nSTOREG  "
            + String.valueOf(sp-1) + "\nJUMP " 
            + String.valueOf(labelArray[0]) + "\nLABEL "
            + String.valueOf(labelArray[2]) + "\nSTOREG "
            + String.valueOf(sp-2) + "\nSTOREG  "
            + String.valueOf(sp-3) + "\nPOP\n";
        return code;
    }
            
    public String entierplproche(){
        String code ="PUSHI 1\nPUSHI 2\n";
        moveSp(2);
        code+= additionCode() + "DIV\n";
        moveSp(-2);
        return code;
    }
    
    public String entieresuperieure(){
        String code = "PUSHI 0\nPUSHR " 
            + String.valueOf(sp-2) + "\nPUSHI 0\nPUSHR "
            + String.valueOf(sp-1) + "\nPUSHI -1\nADD\nADD\nSTOREG " 
            + String.valueOf(sp-2) + "\nDIV\n";
        return code;
    }

    public String lireCode(String variable) {
   
        String type = getVariableType(variable);
        return type.equals("rationnel")  
        ? "READ\nREAD\nSTOREG " + String.valueOf(AddressTable.get(variable)+1) + "\nSTOREG " + String.valueOf(AddressTable.get(variable))+"\n"
        : "READ\nSTOREG " + String.valueOf(AddressTable.get(variable)) + "\n";

    }

    public String compareCode(String op){
        String code = "DUP\nPUSHI 0\nPUSHR " 
            + String.valueOf(sp-4) + "\nMUL\nPUSHI 0\nPUSHR " 
            + String.valueOf(sp-2) + "\nPUSHI 0\nPUSHR "
            + String.valueOf(sp-3) + "\nMUL\n"
            + String.valueOf(op)+"\n"+"\nSTOREG "
            + String.valueOf(sp-4)+ "\nPOP\nPOP\nPOP\n";
        return code;
    }

    public String compareCodeand(String s){
        int  i = createLabel();
        String code = "PUSHI 1\nEQUAL\nDUP\nJUMPF"
            + String.valueOf(i) + "\n"
            + String.valueOf(s)+"\nMUL\nLABEL "
            + String.valueOf(i)+"\n";
        return code;
    }

    public String compareCodeor(String s){
        int  i = createLabel();
        String code = "DUP\nPUSHI 1\nSUB\nJUMPF "
            + String.valueOf(i) + "\n"
            + String.valueOf(s) + "\nADD\nLABEL "
            + String.valueOf(i)+"\n";
        return code;
    }

    public String afficherCode(String output) {
        return output + "PUSHG " + String.valueOf(sp-2) + "\nWRITE\nPOP\nWRITE\nPOP\nPOP\n";
    }

    public String repeterCode(String instructions, String condition){
        int  i = createLabel();
        String code = "\nLABEL "
            + String.valueOf(i) + "\n"
            + String.valueOf(instructions) + "\n"
            + String.valueOf(condition) + "\nPUSHI 1\nEQUAL\nJUMPF "
            + String.valueOf(i) + "\n" ;
        return code;
    }

    public String clearVariables() {
        String code = new String();
        for(int i = 0; i < varAddressCounter; i++) {
            code += "POP\n";
        }
        return code;
    }
}

start returns [ String code ]
    @init{ $code = new String(); }
    @after{displayCode($code);} 

    :   (decl NEWLINE* finInstruction NEWLINE* {$code += $decl.code; } )* 
        (instruction NEWLINE* finInstruction NEWLINE* { $code += $instruction.code; })* 
    { $code += clearVariables() + "HALT\n"; }
;

decl returns [ String code ] 
    @init{ $code = new String(); }
    : TYPE 
        (id = IDENTIFIANT VIRGULE NEWLINE* { $code += initVariable($id.text, $TYPE.text);} )* 
        id = IDENTIFIANT  { $code += initVariable($id.text, $TYPE.text); }
;

instruction returns [String code] 
    : assignation  { $code=$assignation.code; }
    | exprB { $code=$exprB.code; }
    | exprC { $code=$exprC.code; }
    | exprI { $code=$exprI.code; }
    | exprR { $code=$exprR.code; }
    | exprRep { $code=$exprRep.code; }
    | affichage { $code=$affichage.code; }
;

assignation returns [ String code ]
    : IDENTIFIANT EGALE LIRE { $code = lireCode($IDENTIFIANT.text);}
    | IDENTIFIANT EGALE exprB { $code = assignCode($IDENTIFIANT.text, "bool", $exprB.code); }
    | IDENTIFIANT EGALE exprI { $code = assignCode($IDENTIFIANT.text, "int", $exprI.code); }
    | IDENTIFIANT EGALE exprR { $code = assignCode($IDENTIFIANT.text, "rationnel", $exprR.code); }
;

exprR returns [String code] 
    : c=exprI SLASH d=exprI {$code = $c.code + $d.code ;}
    | PARENTHESE_G exprR PARENTHESE_D { $code = $exprR.code; }
    | MOINS exprR { $code = $exprR.code + "PUSHI -1\nMUL\n"; }
    | a=exprR ETOILE ETOILE c=exprI {$code = $a.code+$c.code+puissanceCode(); moveSp(-1);}

    //rationnel op rationnel = rationnel
    | a=exprR ETOILE b=exprR { $code = $a.code + $b.code + multCode() ;  moveSp(-2); $code+=simCode(); }
    | a=exprR DPOINTS b=exprR { $code = $a.code + $b.code + divCode() ;  moveSp(-2); $code+=simCode();}
    | a=exprR PLUS b=exprR { $code = $a.code + $b.code + additionCode() ;  moveSp(-2); $code+=simCode();}
    | a=exprR MOINS b=exprR { $code = $a.code + $b.code + subCode() ;  moveSp(-2); $code+=simCode();}
   
    //rationnel op int = rationnel
    | a=exprR ETOILE e=exprI { $code = $a.code + $e.code + "PUSHI 1\n"; moveSp(1); $code += multCode() ;  moveSp(-2); $code+=simCode(); }
    | a=exprR DPOINTS e=exprI { $code = $a.code + $e.code + "PUSHI 1\n"; moveSp(1); $code += divCode() ;  moveSp(-2); $code+=simCode();}
    | a=exprR PLUS e=exprI { $code = $a.code + $e.code + "PUSHI 1\n"; moveSp(1); $code += additionCode() ;  moveSp(-2); $code+=simCode();}
    | a=exprR MOINS e=exprI { $code = $a.code + $e.code + "PUSHI 1\n"; moveSp(1); $code += subCode() ;  moveSp(-2); $code+=simCode();}

    //int op rationnel = rationnel
    | exprI ETOILE exprR { $code = $exprI.code + "PUSHI 1\n"; moveSp(1); $code += $exprR.code  + multCode() ;  moveSp(-2); $code+=simCode(); }
    | exprI DPOINTS exprR {  $code = $exprI.code + "PUSHI 1\n"; moveSp(1); $code += $exprR.code + divCode() ;  moveSp(-2); $code+=simCode();}
    | exprI PLUS exprR {  $code = $exprI.code + "PUSHI 1\n"; moveSp(1); $code += $exprR.code + additionCode() ;  moveSp(-2); $code+=simCode();}
    | exprI MOINS exprR {  $code = $exprI.code + "PUSHI 1\n"; moveSp(1); $code += $exprR.code + subCode() ;  moveSp(-2); $code+=simCode();}

    // int op int = rationnel 
    | e1=exprI ETOILE e2=exprI { $code = $e1.code + $e2.code + "MUL\nPUSHI1\n" ; }
    | e1=exprI DPOINTS e2=exprI { $code = $e1.code + $e2.code + simCode() ; }
    | e1=exprI PLUS e2=exprI { $code = $e1.code + $e2.code + "ADD\nPUSHI1\n" ; }
    | e1=exprI MOINS e2=exprI { $code = $e1.code + $e2.code + "SUB\nPUSHI1\n" ; }

    | SIM PARENTHESE_G exprR PARENTHESE_D {$code=$exprR.code + simCode();}
    | IDENTIFIANT {$code = "PUSHG " + String.valueOf(AddressTable.get($IDENTIFIANT.text)) + "\nPUSHG " + String.valueOf(AddressTable.get($IDENTIFIANT.text) + 1) + "\n";moveSp(2);}
    | LIRE {$code = "READ\nREAD\n"; moveSp(2);}
;

exprI returns [String code] 
    : PARENTHESE_G exprI PARENTHESE_D {$code = $exprI.code;}
    | MOINS exprI {$code = $exprI.code + "PUSHI -1\nMUL\n";} 
    | PGCD PARENTHESE_G a=exprI VIRGULE b=exprI PARENTHESE_D { $code = $a.code + $b.code + pgcdCode();moveSp(-1);}
    | PPCM PARENTHESE_G a=exprI VIRGULE b=exprI PARENTHESE_D { $code = $a.code + $b.code + ppcmCode();moveSp(-1);}
    | DENUM PARENTHESE_G exprR PARENTHESE_D {$code = $exprR.code +"STOREG "+String.valueOf(sp-2)+"\n"; moveSp(-1);}
    | NUM PARENTHESE_G exprR PARENTHESE_D {$code = $exprR.code + "POP\n"; moveSp(-1);}
    | POURCENTAGE exprR  {$code = $exprR.code + prcntgCode();moveSp(-1);}
    | CROCHET_G exprR CROCHET_D {$code=$exprR.code+entierplproche(); moveSp(-1);} 
    | CROCHET_G PLUS exprR PLUS CROCHET_D {$code=$exprR.code+entieresuperieure();moveSp(-1);} 
    | CROCHET_G MOINS exprR MOINS CROCHET_D {$code=$exprR.code+"DIV\n";moveSp(-1);} 
    | ENTIER {$code = "PUSHI " + Integer.parseInt($ENTIER.text)+"\n"; moveSp(1);} 
    | IDENTIFIANT {$code = "PUSHG " + String.valueOf(AddressTable.get($IDENTIFIANT.text)) + "\n";moveSp(1);}
    | LIRE {$code = "READ\n"; moveSp(1);}
;

exprB returns [String code]
    :  NOT e=exprB { $code = "PUSHI 1\n" + $e.code + "SUB\n";}
    | PARENTHESE_G e=exprB PARENTHESE_D { $code = $e.code; }
    | e1=exprB AND e2=exprB { $code = $e1.code+compareCodeand($e2.code);moveSp(-1); } 
    | e1=exprB OR e2=exprB { $code = $e1.code +compareCodeor($e2.code);moveSp(-1); }
    | a=exprR EGALE EGALE b=exprR {$code= $a.code+$b.code+compareCode("EQUAL");moveSp(-3);}
    | a=exprR INF SUPP b=exprR { $code = $a.code + $b.code +compareCode("NEQ");moveSp(-3);}
    | a=exprR INF b=exprR { $code = $a.code + $b.code +compareCode("INF");moveSp(-3); }
    | a=exprR SUPP b=exprR { $code = $a.code + $b.code +compareCode("SUP");moveSp(-3);  }
    | a=exprR INF EGALE b=exprR { $code = $a.code + $b.code +compareCode("INFEQ");moveSp(-3); }
    | a=exprR SUPP EGALE b=exprR { $code = $a.code + $b.code +compareCode("SUPEQ");moveSp(-3); }
    | BOOLEAN {$code = "PUSHI " + (Boolean.parseBoolean($BOOLEAN.text) ? "1" : "0")  + "\n";moveSp(1);}
    | IDENTIFIANT {$code = "PUSHG " + String.valueOf(AddressTable.get($IDENTIFIANT.text)) + "\n";moveSp(1);}
    | LIRE {$code = "READ\n"; moveSp(1);}
;

exprC returns [String code]
    @init {
        String code_if = new String();
        String code_else = new String();

        String label_if = String.valueOf(createLabel());
        String label_else = String.valueOf(createLabel());
        int sp_else = sp;
        
    }
    :  exprB 
        POINT_INTERRO NEWLINE* ACCOLADE_G NEWLINE*
            (instruction NEWLINE* finInstruction NEWLINE* { code_if += $instruction.code; })* {moveSp(sp_else-sp);}
        ACCOLADE_D NEWLINE* 
        (
            DPOINTS NEWLINE* 
            ACCOLADE_G NEWLINE*   
                ((instruction NEWLINE* finInstruction NEWLINE* { code_else += $instruction.code;moveSp(sp_else-sp); })*
                | exprC {code_else += $exprC.code;})
            ACCOLADE_D NEWLINE* | finInstruction 
        )?
        {
            $code = $exprB.code + "DUP\nJUMPF " + label_if + "\n" + code_if;

            if (code_else != "") {$code += "POP\nJUMP " + label_else + "\n";}

            $code += "LABEL " + label_if + "\nPOP\n";
            
            if (code_else != "") {
                $code += code_else;
                $code += "LABEL " + label_else + "\n";
            } 
        }
;

exprRep returns[String code]
    @init{ String instructions = new String(); }
    : REPETER NEWLINE* (instruction finInstruction NEWLINE* {instructions += $instruction.code;})+ 
      JUSQUE NEWLINE* exprB  
        {
            $code = repeterCode(instructions , $exprB.code);
            moveSp(-1);
        }
;

affichage returns [String code]
    : AFFICHER PARENTHESE_G exprR PARENTHESE_D {$code =  afficherCode($exprR.code); moveSp(-2);}
;

finInstruction
    : (POINT_VIRGULE)+
;

POINT_VIRGULE : ';';
PARENTHESE_G : '(';
PARENTHESE_D : ')';
CROCHET_G : '[';
CROCHET_D : ']';
VIRGULE : ',';
ACCOLADE_G : '{';
ACCOLADE_D : '}';
POINT_INTERRO : '?';

AND : 'and';
OR : 'or';
NOT : 'not';

PGCD : 'pgcd';
PPCM : 'ppcm';
DENUM : 'denum';
NUM : 'num';
SIM : 'sim';

AFFICHER : 'afficher';
LIRE : 'lire()';
REPETER : 'repeter';
JUSQUE : 'jusque';

EGALE : '=';
SUPP : '>';
INF : '<';
MOINS : '-';
SLASH : '/';
POURCENTAGE : '%';
PLUS : '+';
ETOILE : '*';
DPOINTS : ':';

NEWLINE : '\r'? '\n' | '\r';
TYPE: 'int' | 'bool' | 'rationnel';

BOOLEAN: 'true' | 'false';
IDENTIFIANT: [a-zA-Z_] [a-zA-Z_0-9]*;

WS : (' '|'\t')+ -> skip;
ENTIER: [0-9]+;

COMMENTAIRE: ('/*' .*? '*/' ) -> skip; 


/*
1-structure conditionnelle : 

    expression booleene ? 
        {
            les instructions if;
        } : 
        {
            les instructions else;
        }; (point virgule obligatoire)

1-structure repeter :

    repeter
        instructions;
    jusque expression booleene ;

 */