// Generated from Rationnel.g4 by ANTLR 4.9.2

    import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RationnelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		POINT_VIRGULE=1, PARENTHESE_G=2, PARENTHESE_D=3, CROCHET_G=4, CROCHET_D=5, 
		VIRGULE=6, ACCOLADE_G=7, ACCOLADE_D=8, POINT_INTERRO=9, AND=10, OR=11, 
		NOT=12, PGCD=13, PPCM=14, DENUM=15, NUM=16, SIM=17, AFFICHER=18, LIRE=19, 
		REPETER=20, JUSQUE=21, EGALE=22, SUPP=23, INF=24, MOINS=25, SLASH=26, 
		POURCENTAGE=27, PLUS=28, ETOILE=29, DPOINTS=30, NEWLINE=31, TYPE=32, BOOLEAN=33, 
		IDENTIFIANT=34, WS=35, ENTIER=36, COMMENTAIRE=37;
	public static final int
		RULE_start = 0, RULE_decl = 1, RULE_instruction = 2, RULE_assignation = 3, 
		RULE_exprR = 4, RULE_exprI = 5, RULE_exprB = 6, RULE_exprC = 7, RULE_exprRep = 8, 
		RULE_affichage = 9, RULE_finInstruction = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "decl", "instruction", "assignation", "exprR", "exprI", "exprB", 
			"exprC", "exprRep", "affichage", "finInstruction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'['", "']'", "','", "'{'", "'}'", "'?'", 
			"'and'", "'or'", "'not'", "'pgcd'", "'ppcm'", "'denum'", "'num'", "'sim'", 
			"'afficher'", "'lire()'", "'repeter'", "'jusque'", "'='", "'>'", "'<'", 
			"'-'", "'/'", "'%'", "'+'", "'*'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "POINT_VIRGULE", "PARENTHESE_G", "PARENTHESE_D", "CROCHET_G", "CROCHET_D", 
			"VIRGULE", "ACCOLADE_G", "ACCOLADE_D", "POINT_INTERRO", "AND", "OR", 
			"NOT", "PGCD", "PPCM", "DENUM", "NUM", "SIM", "AFFICHER", "LIRE", "REPETER", 
			"JUSQUE", "EGALE", "SUPP", "INF", "MOINS", "SLASH", "POURCENTAGE", "PLUS", 
			"ETOILE", "DPOINTS", "NEWLINE", "TYPE", "BOOLEAN", "IDENTIFIANT", "WS", 
			"ENTIER", "COMMENTAIRE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Rationnel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



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

	public RationnelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public String code;
		public DeclContext decl;
		public InstructionContext instruction;
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<FinInstructionContext> finInstruction() {
			return getRuleContexts(FinInstructionContext.class);
		}
		public FinInstructionContext finInstruction(int i) {
			return getRuleContext(FinInstructionContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RationnelParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RationnelParser.NEWLINE, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationnelListener ) ((RationnelListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationnelListener ) ((RationnelListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		 ((StartContext)_localctx).code =  new String(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(22);
				((StartContext)_localctx).decl = decl();
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(23);
					match(NEWLINE);
					}
					}
					setState(28);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(29);
				finInstruction();
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(30);
					match(NEWLINE);
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				_localctx.code += ((StartContext)_localctx).decl.code; 
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTHESE_G) | (1L << CROCHET_G) | (1L << NOT) | (1L << PGCD) | (1L << PPCM) | (1L << DENUM) | (1L << NUM) | (1L << SIM) | (1L << AFFICHER) | (1L << LIRE) | (1L << REPETER) | (1L << MOINS) | (1L << POURCENTAGE) | (1L << BOOLEAN) | (1L << IDENTIFIANT) | (1L << ENTIER))) != 0)) {
				{
				{
				setState(43);
				((StartContext)_localctx).instruction = instruction();
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(44);
					match(NEWLINE);
					}
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(50);
				finInstruction();
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(51);
					match(NEWLINE);
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 _localctx.code += ((StartContext)_localctx).instruction.code; 
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.code += clearVariables() + "HALT\n"; 
			}
			_ctx.stop = _input.LT(-1);
			displayCode(_localctx.code);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public String code;
		public Token TYPE;
		public Token id;
		public TerminalNode TYPE() { return getToken(RationnelParser.TYPE, 0); }
		public List<TerminalNode> IDENTIFIANT() { return getTokens(RationnelParser.IDENTIFIANT); }
		public TerminalNode IDENTIFIANT(int i) {
			return getToken(RationnelParser.IDENTIFIANT, i);
		}
		public List<TerminalNode> VIRGULE() { return getTokens(RationnelParser.VIRGULE); }
		public TerminalNode VIRGULE(int i) {
			return getToken(RationnelParser.VIRGULE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RationnelParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RationnelParser.NEWLINE, i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationnelListener ) ((RationnelListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationnelListener ) ((RationnelListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		 ((DeclContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			((DeclContext)_localctx).TYPE = match(TYPE);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					((DeclContext)_localctx).id = match(IDENTIFIANT);
					setState(68);
					match(VIRGULE);
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(69);
						match(NEWLINE);
						}
						}
						setState(74);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					 _localctx.code += initVariable((((DeclContext)_localctx).id!=null?((DeclContext)_localctx).id.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null));
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(81);
			((DeclContext)_localctx).id = match(IDENTIFIANT);
			 _localctx.code += initVariable((((DeclContext)_localctx).id!=null?((DeclContext)_localctx).id.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public String code;
		public AssignationContext assignation;
		public ExprBContext exprB;
		public ExprCContext exprC;
		public ExprIContext exprI;
		public ExprRContext exprR;
		public ExprRepContext exprRep;
		public AffichageContext affichage;
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public ExprBContext exprB() {
			return getRuleContext(ExprBContext.class,0);
		}
		public ExprCContext exprC() {
			return getRuleContext(ExprCContext.class,0);
		}
		public ExprIContext exprI() {
			return getRuleContext(ExprIContext.class,0);
		}
		public ExprRContext exprR() {
			return getRuleContext(ExprRContext.class,0);
		}
		public ExprRepContext exprRep() {
			return getRuleContext(ExprRepContext.class,0);
		}
		public AffichageContext affichage() {
			return getRuleContext(AffichageContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationnelListener ) ((RationnelListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationnelListener ) ((RationnelListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				((InstructionContext)_localctx).assignation = assignation();
				 ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).assignation.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				((InstructionContext)_localctx).exprB = exprB(0);
				 ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).exprB.code; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				((InstructionContext)_localctx).exprC = exprC();
				 ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).exprC.code; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				((InstructionContext)_localctx).exprI = exprI();
				 ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).exprI.code; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				((InstructionContext)_localctx).exprR = exprR(0);
				 ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).exprR.code; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				((InstructionContext)_localctx).exprRep = exprRep();
				 ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).exprRep.code; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(102);
				((InstructionContext)_localctx).affichage = affichage();
				 ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).affichage.code; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignationContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public ExprBContext exprB;
		public ExprIContext exprI;
		public ExprRContext exprR;
		public TerminalNode IDENTIFIANT() { return getToken(RationnelParser.IDENTIFIANT, 0); }
		public TerminalNode EGALE() { return getToken(RationnelParser.EGALE, 0); }
		public TerminalNode LIRE() { return getToken(RationnelParser.LIRE, 0); }
		public ExprBContext exprB() {
			return getRuleContext(ExprBContext.class,0);
		}
		public ExprIContext exprI() {
			return getRuleContext(ExprIContext.class,0);
		}
		public ExprRContext exprR() {
			return getRuleContext(ExprRContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationnelListener ) ((RationnelListener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationnelListener ) ((RationnelListener)listener).exitAssignation(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignation);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(108);
				match(EGALE);
				setState(109);
				match(LIRE);
				 ((AssignationContext)_localctx).code =  lireCode((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(112);
				match(EGALE);
				setState(113);
				((AssignationContext)_localctx).exprB = exprB(0);
				 ((AssignationContext)_localctx).code =  assignCode((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null), "bool", ((AssignationContext)_localctx).exprB.code); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(117);
				match(EGALE);
				setState(118);
				((AssignationContext)_localctx).exprI = exprI();
				 ((AssignationContext)_localctx).code =  assignCode((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null), "int", ((AssignationContext)_localctx).exprI.code); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(122);
				match(EGALE);
				setState(123);
				((AssignationContext)_localctx).exprR = exprR(0);
				 ((AssignationContext)_localctx).code =  assignCode((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null), "rationnel", ((AssignationContext)_localctx).exprR.code); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprRContext extends ParserRuleContext {
		public String code;
		public ExprRContext a;
		public ExprIContext c;
		public ExprIContext exprI;
		public ExprIContext d;
		public ExprRContext exprR;
		public ExprIContext e1;
		public ExprIContext e2;
		public Token IDENTIFIANT;
		public ExprRContext b;
		public ExprIContext e;
		public TerminalNode SLASH() { return getToken(RationnelParser.SLASH, 0); }
		public List<ExprIContext> exprI() {
			return getRuleContexts(ExprIContext.class);
		}
		public ExprIContext exprI(int i) {
			return getRuleContext(ExprIContext.class,i);
		}
		public TerminalNode PARENTHESE_G() { return getToken(RationnelParser.PARENTHESE_G, 0); }
		public List<ExprRContext> exprR() {
			return getRuleContexts(ExprRContext.class);
		}
		public ExprRContext exprR(int i) {
			return getRuleContext(ExprRContext.class,i);
		}
		public TerminalNode PARENTHESE_D() { return getToken(RationnelParser.PARENTHESE_D, 0); }
		public TerminalNode MOINS() { return getToken(RationnelParser.MOINS, 0); }
		public List<TerminalNode> ETOILE() { return getTokens(RationnelParser.ETOILE); }
		public TerminalNode ETOILE(int i) {
			return getToken(RationnelParser.ETOILE, i);
		}
		public TerminalNode DPOINTS() { return getToken(RationnelParser.DPOINTS, 0); }
		public TerminalNode PLUS() { return getToken(RationnelParser.PLUS, 0); }
		public TerminalNode SIM() { return getToken(RationnelParser.SIM, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(RationnelParser.IDENTIFIANT, 0); }
		public TerminalNode LIRE() { return getToken(RationnelParser.LIRE, 0); }
		public ExprRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationnelListener ) ((RationnelListener)listener).enterExprR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationnelListener ) ((RationnelListener)listener).exitExprR(this);
		}
	}

	public final ExprRContext exprR() throws RecognitionException {
		return exprR(0);
	}

	private ExprRContext exprR(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprRContext _localctx = new ExprRContext(_ctx, _parentState);
		ExprRContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_exprR, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(129);
				((ExprRContext)_localctx).c = ((ExprRContext)_localctx).exprI = exprI();
				setState(130);
				match(SLASH);
				setState(131);
				((ExprRContext)_localctx).d = ((ExprRContext)_localctx).exprI = exprI();
				((ExprRContext)_localctx).code =  ((ExprRContext)_localctx).c.code + ((ExprRContext)_localctx).d.code ;
				}
				break;
			case 2:
				{
				setState(134);
				match(PARENTHESE_G);
				setState(135);
				((ExprRContext)_localctx).exprR = exprR(0);
				setState(136);
				match(PARENTHESE_D);
				 ((ExprRContext)_localctx).code =  ((ExprRContext)_localctx).exprR.code; 
				}
				break;
			case 3:
				{
				setState(139);
				match(MOINS);
				setState(140);
				((ExprRContext)_localctx).exprR = exprR(21);
				 ((ExprRContext)_localctx).code =  ((ExprRContext)_localctx).exprR.code + "PUSHI -1\nMUL\n"; 
				}
				break;
			case 4:
				{
				setState(143);
				((ExprRContext)_localctx).exprI = exprI();
				setState(144);
				match(ETOILE);
				setState(145);
				((ExprRContext)_localctx).exprR = exprR(11);
				 ((ExprRContext)_localctx).code =  ((ExprRContext)_localctx).exprI.code + "PUSHI 1\n"; moveSp(1); _localctx.code += ((ExprRContext)_localctx).exprR.code  + multCode() ;  moveSp(-2); _localctx.code+=simCode(); 
				}
				break;
			case 5:
				{
				setState(148);
				((ExprRContext)_localctx).exprI = exprI();
				setState(149);
				match(DPOINTS);
				setState(150);
				((ExprRContext)_localctx).exprR = exprR(10);
				  ((ExprRContext)_localctx).code =  ((ExprRContext)_localctx).exprI.code + "PUSHI 1\n"; moveSp(1); _localctx.code += ((ExprRContext)_localctx).exprR.code + divCode() ;  moveSp(-2); _localctx.code+=simCode();
				}
				break;
			case 6:
				{
				setState(153);
				((ExprRContext)_localctx).exprI = exprI();
				setState(154);
				match(PLUS);
				setState(155);
				((ExprRContext)_localctx).exprR = exprR(9);
				  ((ExprRContext)_localctx).code =  ((ExprRContext)_localctx).exprI.code + "PUSHI 1\n"; moveSp(1); _localctx.code += ((ExprRContext)_localctx).exprR.code + additionCode() ;  moveSp(-2); _localctx.code+=simCode();
				}
				break;
			case 7:
				{
				setState(158);
				((ExprRContext)_localctx).exprI = exprI();
				setState(159);
				match(MOINS);
				setState(160);
				((ExprRContext)_localctx).exprR = exprR(8);
				  ((ExprRContext)_localctx).code =  ((ExprRContext)_localctx).exprI.code + "PUSHI 1\n"; moveSp(1); _localctx.code += ((ExprRContext)_localctx).exprR.code + subCode() ;  moveSp(-2); _localctx.code+=simCode();
				}
				break;
			case 8:
				{
				setState(163);
				((ExprRContext)_localctx).e1 = ((ExprRContext)_localctx).exprI = exprI();
				setState(164);
				match(ETOILE);
				setState(165);
				((ExprRContext)_localctx).e2 = ((ExprRContext)_localctx).exprI = exprI();
				 ((ExprRContext)_localctx).code =  ((ExprRContext)_localctx).e1.code + ((ExprRContext)_localctx).e2.code + "MUL\nPUSHI1\n" ; 
				}
				break;
			case 9:
				{
				setState(168);
				((ExprRContext)_localctx).e1 = ((ExprRContext)_localctx).exprI = exprI();
				setState(169);
				match(DPOINTS);
				setState(170);
				((ExprRContext)_localctx).e2 = ((ExprRContext)_localctx).exprI = exprI();
				 ((ExprRContext)_localctx).code =  ((ExprRContext)_localctx).e1.code + ((ExprRContext)_localctx).e2.code + simCode() ; 
				}
				break;
			case 10:
				{
				setState(173);
				((ExprRContext)_localctx).e1 = ((ExprRContext)_localctx).exprI = exprI();
				setState(174);
				match(PLUS);
				setState(175);
				((ExprRContext)_localctx).e2 = ((ExprRContext)_localctx).exprI = exprI();
				 ((ExprRContext)_localctx).code =  ((ExprRContext)_localctx).e1.code + ((ExprRContext)_localctx).e2.code + "ADD\nPUSHI1\n" ; 
				}
				break;
			case 11:
				{
				setState(178);
				((ExprRContext)_localctx).e1 = ((ExprRContext)_localctx).exprI = exprI();
				setState(179);
				match(MOINS);
				setState(180);
				((ExprRContext)_localctx).e2 = ((ExprRContext)_localctx).exprI = exprI();
				 ((ExprRContext)_localctx).code =  ((ExprRContext)_localctx).e1.code + ((ExprRContext)_localctx).e2.code + "SUB\nPUSHI1\n" ; 
				}
				break;
			case 12:
				{
				setState(183);
				match(SIM);
				setState(184);
				match(PARENTHESE_G);
				setState(185);
				((ExprRContext)_localctx).exprR = exprR(0);
				setState(186);
				match(PARENTHESE_D);
				((ExprRContext)_localctx).code = ((ExprRContext)_localctx).exprR.code + simCode();
				}
				break;
			case 13:
				{
				setState(189);
				((ExprRContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				((ExprRContext)_localctx).code =  "PUSHG " + String.valueOf(AddressTable.get((((ExprRContext)_localctx).IDENTIFIANT!=null?((ExprRContext)_localctx).IDENTIFIANT.getText():null))) + "\nPUSHG " + String.valueOf(AddressTable.get((((ExprRContext)_localctx).IDENTIFIANT!=null?((ExprRContext)_localctx).IDENTIFIANT.getText():null)) + 1) + "\n";moveSp(2);
				}
				break;
			case 14:
				{
				setState(191);
				match(LIRE);
				((ExprRContext)_localctx).code =  "READ\nREAD\n"; moveSp(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(241);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprRContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprR);
						setState(195);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(196);
						match(ETOILE);
						setState(197);
						((ExprRContext)_localctx).b = ((ExprRContext)_localctx).exprR = exprR(20);
						 ((ExprRContext)_localctx).code =  ((ExprRContext)_localctx).a.code + ((ExprRContext)_localctx).b.code + multCode() ;  moveSp(-2); _localctx.code+=simCode(); 
						}
						break;
					case 2:
						{
						_localctx = new ExprRContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprR);
						setState(200);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(201);
						match(DPOINTS);
						setState(202);
						((ExprRContext)_localctx).b = ((ExprRContext)_localctx).exprR = exprR(19);
						 ((ExprRContext)_localctx).code =  ((ExprRContext)_localctx).a.code + ((ExprRContext)_localctx).b.code + divCode() ;  moveSp(-2); _localctx.code+=simCode();
						}
						break;
					case 3:
						{
						_localctx = new ExprRContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprR);
						setState(205);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(206);
						match(PLUS);
						setState(207);
						((ExprRContext)_localctx).b = ((ExprRContext)_localctx).exprR = exprR(18);
						 ((ExprRContext)_localctx).code =  ((ExprRContext)_localctx).a.code + ((ExprRContext)_localctx).b.code + additionCode() ;  moveSp(-2); _localctx.code+=simCode();
						}
						break;
					case 4:
						{
						_localctx = new ExprRContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprR);
						setState(210);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(211);
						match(MOINS);
						setState(212);
						((ExprRContext)_localctx).b = ((ExprRContext)_localctx).exprR = exprR(17);
						 ((ExprRContext)_localctx).code =  ((ExprRContext)_localctx).a.code + ((ExprRContext)_localctx).b.code + subCode() ;  moveSp(-2); _localctx.code+=simCode();
						}
						break;
					case 5:
						{
						_localctx = new ExprRContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprR);
						setState(215);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(216);
						match(ETOILE);
						setState(217);
						match(ETOILE);
						setState(218);
						((ExprRContext)_localctx).c = ((ExprRContext)_localctx).exprI = exprI();
						((ExprRContext)_localctx).code =  ((ExprRContext)_localctx).a.code+((ExprRContext)_localctx).c.code+puissanceCode(); moveSp(-1);
						}
						break;
					case 6:
						{
						_localctx = new ExprRContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprR);
						setState(221);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(222);
						match(ETOILE);
						setState(223);
						((ExprRContext)_localctx).e = ((ExprRContext)_localctx).exprI = exprI();
						 ((ExprRContext)_localctx).code =  ((ExprRContext)_localctx).a.code + ((ExprRContext)_localctx).e.code + "PUSHI 1\n"; moveSp(1); _localctx.code += multCode() ;  moveSp(-2); _localctx.code+=simCode(); 
						}
						break;
					case 7:
						{
						_localctx = new ExprRContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprR);
						setState(226);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(227);
						match(DPOINTS);
						setState(228);
						((ExprRContext)_localctx).e = ((ExprRContext)_localctx).exprI = exprI();
						 ((ExprRContext)_localctx).code =  ((ExprRContext)_localctx).a.code + ((ExprRContext)_localctx).e.code + "PUSHI 1\n"; moveSp(1); _localctx.code += divCode() ;  moveSp(-2); _localctx.code+=simCode();
						}
						break;
					case 8:
						{
						_localctx = new ExprRContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprR);
						setState(231);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(232);
						match(PLUS);
						setState(233);
						((ExprRContext)_localctx).e = ((ExprRContext)_localctx).exprI = exprI();
						 ((ExprRContext)_localctx).code =  ((ExprRContext)_localctx).a.code + ((ExprRContext)_localctx).e.code + "PUSHI 1\n"; moveSp(1); _localctx.code += additionCode() ;  moveSp(-2); _localctx.code+=simCode();
						}
						break;
					case 9:
						{
						_localctx = new ExprRContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprR);
						setState(236);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(237);
						match(MOINS);
						setState(238);
						((ExprRContext)_localctx).e = ((ExprRContext)_localctx).exprI = exprI();
						 ((ExprRContext)_localctx).code =  ((ExprRContext)_localctx).a.code + ((ExprRContext)_localctx).e.code + "PUSHI 1\n"; moveSp(1); _localctx.code += subCode() ;  moveSp(-2); _localctx.code+=simCode();
						}
						break;
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprIContext extends ParserRuleContext {
		public String code;
		public ExprIContext exprI;
		public ExprIContext a;
		public ExprIContext b;
		public ExprRContext exprR;
		public Token ENTIER;
		public Token IDENTIFIANT;
		public TerminalNode PARENTHESE_G() { return getToken(RationnelParser.PARENTHESE_G, 0); }
		public List<ExprIContext> exprI() {
			return getRuleContexts(ExprIContext.class);
		}
		public ExprIContext exprI(int i) {
			return getRuleContext(ExprIContext.class,i);
		}
		public TerminalNode PARENTHESE_D() { return getToken(RationnelParser.PARENTHESE_D, 0); }
		public List<TerminalNode> MOINS() { return getTokens(RationnelParser.MOINS); }
		public TerminalNode MOINS(int i) {
			return getToken(RationnelParser.MOINS, i);
		}
		public TerminalNode PGCD() { return getToken(RationnelParser.PGCD, 0); }
		public TerminalNode VIRGULE() { return getToken(RationnelParser.VIRGULE, 0); }
		public TerminalNode PPCM() { return getToken(RationnelParser.PPCM, 0); }
		public TerminalNode DENUM() { return getToken(RationnelParser.DENUM, 0); }
		public ExprRContext exprR() {
			return getRuleContext(ExprRContext.class,0);
		}
		public TerminalNode NUM() { return getToken(RationnelParser.NUM, 0); }
		public TerminalNode POURCENTAGE() { return getToken(RationnelParser.POURCENTAGE, 0); }
		public TerminalNode CROCHET_G() { return getToken(RationnelParser.CROCHET_G, 0); }
		public TerminalNode CROCHET_D() { return getToken(RationnelParser.CROCHET_D, 0); }
		public List<TerminalNode> PLUS() { return getTokens(RationnelParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(RationnelParser.PLUS, i);
		}
		public TerminalNode ENTIER() { return getToken(RationnelParser.ENTIER, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(RationnelParser.IDENTIFIANT, 0); }
		public TerminalNode LIRE() { return getToken(RationnelParser.LIRE, 0); }
		public ExprIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprI; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationnelListener ) ((RationnelListener)listener).enterExprI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationnelListener ) ((RationnelListener)listener).exitExprI(this);
		}
	}

	public final ExprIContext exprI() throws RecognitionException {
		ExprIContext _localctx = new ExprIContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exprI);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(PARENTHESE_G);
				setState(247);
				((ExprIContext)_localctx).exprI = exprI();
				setState(248);
				match(PARENTHESE_D);
				((ExprIContext)_localctx).code =  ((ExprIContext)_localctx).exprI.code;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(MOINS);
				setState(252);
				((ExprIContext)_localctx).exprI = exprI();
				((ExprIContext)_localctx).code =  ((ExprIContext)_localctx).exprI.code + "PUSHI -1\nMUL\n";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				match(PGCD);
				setState(256);
				match(PARENTHESE_G);
				setState(257);
				((ExprIContext)_localctx).a = exprI();
				setState(258);
				match(VIRGULE);
				setState(259);
				((ExprIContext)_localctx).b = exprI();
				setState(260);
				match(PARENTHESE_D);
				 ((ExprIContext)_localctx).code =  ((ExprIContext)_localctx).a.code + ((ExprIContext)_localctx).b.code + pgcdCode();moveSp(-1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
				match(PPCM);
				setState(264);
				match(PARENTHESE_G);
				setState(265);
				((ExprIContext)_localctx).a = exprI();
				setState(266);
				match(VIRGULE);
				setState(267);
				((ExprIContext)_localctx).b = exprI();
				setState(268);
				match(PARENTHESE_D);
				 ((ExprIContext)_localctx).code =  ((ExprIContext)_localctx).a.code + ((ExprIContext)_localctx).b.code + ppcmCode();moveSp(-1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				match(DENUM);
				setState(272);
				match(PARENTHESE_G);
				setState(273);
				((ExprIContext)_localctx).exprR = exprR(0);
				setState(274);
				match(PARENTHESE_D);
				((ExprIContext)_localctx).code =  ((ExprIContext)_localctx).exprR.code +"STOREG "+String.valueOf(sp-2)+"\n"; moveSp(-1);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(277);
				match(NUM);
				setState(278);
				match(PARENTHESE_G);
				setState(279);
				((ExprIContext)_localctx).exprR = exprR(0);
				setState(280);
				match(PARENTHESE_D);
				((ExprIContext)_localctx).code =  ((ExprIContext)_localctx).exprR.code + "POP\n"; moveSp(-1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(283);
				match(POURCENTAGE);
				setState(284);
				((ExprIContext)_localctx).exprR = exprR(0);
				((ExprIContext)_localctx).code =  ((ExprIContext)_localctx).exprR.code + prcntgCode();moveSp(-1);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(287);
				match(CROCHET_G);
				setState(288);
				((ExprIContext)_localctx).exprR = exprR(0);
				setState(289);
				match(CROCHET_D);
				((ExprIContext)_localctx).code = ((ExprIContext)_localctx).exprR.code+entierplproche(); moveSp(-1);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(292);
				match(CROCHET_G);
				setState(293);
				match(PLUS);
				setState(294);
				((ExprIContext)_localctx).exprR = exprR(0);
				setState(295);
				match(PLUS);
				setState(296);
				match(CROCHET_D);
				((ExprIContext)_localctx).code = ((ExprIContext)_localctx).exprR.code+entieresuperieure();moveSp(-1);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(299);
				match(CROCHET_G);
				setState(300);
				match(MOINS);
				setState(301);
				((ExprIContext)_localctx).exprR = exprR(0);
				setState(302);
				match(MOINS);
				setState(303);
				match(CROCHET_D);
				((ExprIContext)_localctx).code = ((ExprIContext)_localctx).exprR.code+"DIV\n";moveSp(-1);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(306);
				((ExprIContext)_localctx).ENTIER = match(ENTIER);
				((ExprIContext)_localctx).code =  "PUSHI " + Integer.parseInt((((ExprIContext)_localctx).ENTIER!=null?((ExprIContext)_localctx).ENTIER.getText():null))+"\n"; moveSp(1);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(308);
				((ExprIContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				((ExprIContext)_localctx).code =  "PUSHG " + String.valueOf(AddressTable.get((((ExprIContext)_localctx).IDENTIFIANT!=null?((ExprIContext)_localctx).IDENTIFIANT.getText():null))) + "\n";moveSp(1);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(310);
				match(LIRE);
				((ExprIContext)_localctx).code =  "READ\n"; moveSp(1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprBContext extends ParserRuleContext {
		public String code;
		public ExprBContext e1;
		public ExprBContext e;
		public ExprRContext a;
		public ExprRContext b;
		public Token BOOLEAN;
		public Token IDENTIFIANT;
		public ExprBContext e2;
		public TerminalNode NOT() { return getToken(RationnelParser.NOT, 0); }
		public List<ExprBContext> exprB() {
			return getRuleContexts(ExprBContext.class);
		}
		public ExprBContext exprB(int i) {
			return getRuleContext(ExprBContext.class,i);
		}
		public TerminalNode PARENTHESE_G() { return getToken(RationnelParser.PARENTHESE_G, 0); }
		public TerminalNode PARENTHESE_D() { return getToken(RationnelParser.PARENTHESE_D, 0); }
		public List<TerminalNode> EGALE() { return getTokens(RationnelParser.EGALE); }
		public TerminalNode EGALE(int i) {
			return getToken(RationnelParser.EGALE, i);
		}
		public List<ExprRContext> exprR() {
			return getRuleContexts(ExprRContext.class);
		}
		public ExprRContext exprR(int i) {
			return getRuleContext(ExprRContext.class,i);
		}
		public TerminalNode INF() { return getToken(RationnelParser.INF, 0); }
		public TerminalNode SUPP() { return getToken(RationnelParser.SUPP, 0); }
		public TerminalNode BOOLEAN() { return getToken(RationnelParser.BOOLEAN, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(RationnelParser.IDENTIFIANT, 0); }
		public TerminalNode LIRE() { return getToken(RationnelParser.LIRE, 0); }
		public TerminalNode AND() { return getToken(RationnelParser.AND, 0); }
		public TerminalNode OR() { return getToken(RationnelParser.OR, 0); }
		public ExprBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationnelListener ) ((RationnelListener)listener).enterExprB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationnelListener ) ((RationnelListener)listener).exitExprB(this);
		}
	}

	public final ExprBContext exprB() throws RecognitionException {
		return exprB(0);
	}

	private ExprBContext exprB(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprBContext _localctx = new ExprBContext(_ctx, _parentState);
		ExprBContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_exprB, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(315);
				match(NOT);
				setState(316);
				((ExprBContext)_localctx).e = exprB(13);
				 ((ExprBContext)_localctx).code =  "PUSHI 1\n" + ((ExprBContext)_localctx).e.code + "SUB\n";
				}
				break;
			case 2:
				{
				setState(319);
				match(PARENTHESE_G);
				setState(320);
				((ExprBContext)_localctx).e = exprB(0);
				setState(321);
				match(PARENTHESE_D);
				 ((ExprBContext)_localctx).code =  ((ExprBContext)_localctx).e.code; 
				}
				break;
			case 3:
				{
				setState(324);
				((ExprBContext)_localctx).a = exprR(0);
				setState(325);
				match(EGALE);
				setState(326);
				match(EGALE);
				setState(327);
				((ExprBContext)_localctx).b = exprR(0);
				((ExprBContext)_localctx).code =  ((ExprBContext)_localctx).a.code+((ExprBContext)_localctx).b.code+compareCode("EQUAL");moveSp(-3);
				}
				break;
			case 4:
				{
				setState(330);
				((ExprBContext)_localctx).a = exprR(0);
				setState(331);
				match(INF);
				setState(332);
				match(SUPP);
				setState(333);
				((ExprBContext)_localctx).b = exprR(0);
				 ((ExprBContext)_localctx).code =  ((ExprBContext)_localctx).a.code + ((ExprBContext)_localctx).b.code +compareCode("NEQ");moveSp(-3);
				}
				break;
			case 5:
				{
				setState(336);
				((ExprBContext)_localctx).a = exprR(0);
				setState(337);
				match(INF);
				setState(338);
				((ExprBContext)_localctx).b = exprR(0);
				 ((ExprBContext)_localctx).code =  ((ExprBContext)_localctx).a.code + ((ExprBContext)_localctx).b.code +compareCode("INF");moveSp(-3); 
				}
				break;
			case 6:
				{
				setState(341);
				((ExprBContext)_localctx).a = exprR(0);
				setState(342);
				match(SUPP);
				setState(343);
				((ExprBContext)_localctx).b = exprR(0);
				 ((ExprBContext)_localctx).code =  ((ExprBContext)_localctx).a.code + ((ExprBContext)_localctx).b.code +compareCode("SUP");moveSp(-3);  
				}
				break;
			case 7:
				{
				setState(346);
				((ExprBContext)_localctx).a = exprR(0);
				setState(347);
				match(INF);
				setState(348);
				match(EGALE);
				setState(349);
				((ExprBContext)_localctx).b = exprR(0);
				 ((ExprBContext)_localctx).code =  ((ExprBContext)_localctx).a.code + ((ExprBContext)_localctx).b.code +compareCode("INFEQ");moveSp(-3); 
				}
				break;
			case 8:
				{
				setState(352);
				((ExprBContext)_localctx).a = exprR(0);
				setState(353);
				match(SUPP);
				setState(354);
				match(EGALE);
				setState(355);
				((ExprBContext)_localctx).b = exprR(0);
				 ((ExprBContext)_localctx).code =  ((ExprBContext)_localctx).a.code + ((ExprBContext)_localctx).b.code +compareCode("SUPEQ");moveSp(-3); 
				}
				break;
			case 9:
				{
				setState(358);
				((ExprBContext)_localctx).BOOLEAN = match(BOOLEAN);
				((ExprBContext)_localctx).code =  "PUSHI " + (Boolean.parseBoolean((((ExprBContext)_localctx).BOOLEAN!=null?((ExprBContext)_localctx).BOOLEAN.getText():null)) ? "1" : "0")  + "\n";moveSp(1);
				}
				break;
			case 10:
				{
				setState(360);
				((ExprBContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				((ExprBContext)_localctx).code =  "PUSHG " + String.valueOf(AddressTable.get((((ExprBContext)_localctx).IDENTIFIANT!=null?((ExprBContext)_localctx).IDENTIFIANT.getText():null))) + "\n";moveSp(1);
				}
				break;
			case 11:
				{
				setState(362);
				match(LIRE);
				((ExprBContext)_localctx).code =  "READ\n"; moveSp(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(376);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExprBContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprB);
						setState(366);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(367);
						match(AND);
						setState(368);
						((ExprBContext)_localctx).e2 = exprB(12);
						 ((ExprBContext)_localctx).code =  ((ExprBContext)_localctx).e1.code+compareCodeand(((ExprBContext)_localctx).e2.code);moveSp(-1); 
						}
						break;
					case 2:
						{
						_localctx = new ExprBContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprB);
						setState(371);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(372);
						match(OR);
						setState(373);
						((ExprBContext)_localctx).e2 = exprB(11);
						 ((ExprBContext)_localctx).code =  ((ExprBContext)_localctx).e1.code +compareCodeor(((ExprBContext)_localctx).e2.code);moveSp(-1); 
						}
						break;
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprCContext extends ParserRuleContext {
		public String code;
		public ExprBContext exprB;
		public InstructionContext instruction;
		public ExprCContext exprC;
		public ExprBContext exprB() {
			return getRuleContext(ExprBContext.class,0);
		}
		public TerminalNode POINT_INTERRO() { return getToken(RationnelParser.POINT_INTERRO, 0); }
		public List<TerminalNode> ACCOLADE_G() { return getTokens(RationnelParser.ACCOLADE_G); }
		public TerminalNode ACCOLADE_G(int i) {
			return getToken(RationnelParser.ACCOLADE_G, i);
		}
		public List<TerminalNode> ACCOLADE_D() { return getTokens(RationnelParser.ACCOLADE_D); }
		public TerminalNode ACCOLADE_D(int i) {
			return getToken(RationnelParser.ACCOLADE_D, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RationnelParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RationnelParser.NEWLINE, i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<FinInstructionContext> finInstruction() {
			return getRuleContexts(FinInstructionContext.class);
		}
		public FinInstructionContext finInstruction(int i) {
			return getRuleContext(FinInstructionContext.class,i);
		}
		public TerminalNode DPOINTS() { return getToken(RationnelParser.DPOINTS, 0); }
		public ExprCContext exprC() {
			return getRuleContext(ExprCContext.class,0);
		}
		public ExprCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationnelListener ) ((RationnelListener)listener).enterExprC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationnelListener ) ((RationnelListener)listener).exitExprC(this);
		}
	}

	public final ExprCContext exprC() throws RecognitionException {
		ExprCContext _localctx = new ExprCContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprC);

		        String code_if = new String();
		        String code_else = new String();

		        String label_if = String.valueOf(createLabel());
		        String label_else = String.valueOf(createLabel());
		        int sp_else = sp;
		        
		    
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			((ExprCContext)_localctx).exprB = exprB(0);
			setState(382);
			match(POINT_INTERRO);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(383);
				match(NEWLINE);
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
			match(ACCOLADE_G);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(390);
				match(NEWLINE);
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTHESE_G) | (1L << CROCHET_G) | (1L << NOT) | (1L << PGCD) | (1L << PPCM) | (1L << DENUM) | (1L << NUM) | (1L << SIM) | (1L << AFFICHER) | (1L << LIRE) | (1L << REPETER) | (1L << MOINS) | (1L << POURCENTAGE) | (1L << BOOLEAN) | (1L << IDENTIFIANT) | (1L << ENTIER))) != 0)) {
				{
				{
				setState(396);
				((ExprCContext)_localctx).instruction = instruction();
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(397);
					match(NEWLINE);
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(403);
				finInstruction();
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(404);
					match(NEWLINE);
					}
					}
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 code_if += ((ExprCContext)_localctx).instruction.code; 
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			moveSp(sp_else-sp);
			setState(418);
			match(ACCOLADE_D);
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(419);
					match(NEWLINE);
					}
					} 
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(425);
				match(DPOINTS);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(426);
					match(NEWLINE);
					}
					}
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(432);
				match(ACCOLADE_G);
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(433);
					match(NEWLINE);
					}
					}
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(457);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTHESE_G) | (1L << CROCHET_G) | (1L << NOT) | (1L << PGCD) | (1L << PPCM) | (1L << DENUM) | (1L << NUM) | (1L << SIM) | (1L << AFFICHER) | (1L << LIRE) | (1L << REPETER) | (1L << MOINS) | (1L << POURCENTAGE) | (1L << BOOLEAN) | (1L << IDENTIFIANT) | (1L << ENTIER))) != 0)) {
						{
						{
						setState(439);
						((ExprCContext)_localctx).instruction = instruction();
						setState(443);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(440);
							match(NEWLINE);
							}
							}
							setState(445);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(446);
						finInstruction();
						setState(450);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(447);
							match(NEWLINE);
							}
							}
							setState(452);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						 code_else += ((ExprCContext)_localctx).instruction.code;moveSp(sp_else-sp); 
						}
						}
						setState(459);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(460);
					((ExprCContext)_localctx).exprC = exprC();
					code_else += ((ExprCContext)_localctx).exprC.code;
					}
					break;
				}
				setState(465);
				match(ACCOLADE_D);
				setState(469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(466);
						match(NEWLINE);
						}
						} 
					}
					setState(471);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(472);
				finInstruction();
				}
				break;
			}

			            ((ExprCContext)_localctx).code =  ((ExprCContext)_localctx).exprB.code + "DUP\nJUMPF " + label_if + "\n" + code_if;

			            if (code_else != "") {_localctx.code += "POP\nJUMP " + label_else + "\n";}

			            _localctx.code += "LABEL " + label_if + "\nPOP\n";
			            
			            if (code_else != "") {
			                _localctx.code += code_else;
			                _localctx.code += "LABEL " + label_else + "\n";
			            } 
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprRepContext extends ParserRuleContext {
		public String code;
		public InstructionContext instruction;
		public ExprBContext exprB;
		public TerminalNode REPETER() { return getToken(RationnelParser.REPETER, 0); }
		public TerminalNode JUSQUE() { return getToken(RationnelParser.JUSQUE, 0); }
		public ExprBContext exprB() {
			return getRuleContext(ExprBContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RationnelParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RationnelParser.NEWLINE, i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<FinInstructionContext> finInstruction() {
			return getRuleContexts(FinInstructionContext.class);
		}
		public FinInstructionContext finInstruction(int i) {
			return getRuleContext(FinInstructionContext.class,i);
		}
		public ExprRepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationnelListener ) ((RationnelListener)listener).enterExprRep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationnelListener ) ((RationnelListener)listener).exitExprRep(this);
		}
	}

	public final ExprRepContext exprRep() throws RecognitionException {
		ExprRepContext _localctx = new ExprRepContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exprRep);
		 String instructions = new String(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(REPETER);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(478);
				match(NEWLINE);
				}
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(494); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(484);
				((ExprRepContext)_localctx).instruction = instruction();
				setState(485);
				finInstruction();
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(486);
					match(NEWLINE);
					}
					}
					setState(491);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				instructions += ((ExprRepContext)_localctx).instruction.code;
				}
				}
				setState(496); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTHESE_G) | (1L << CROCHET_G) | (1L << NOT) | (1L << PGCD) | (1L << PPCM) | (1L << DENUM) | (1L << NUM) | (1L << SIM) | (1L << AFFICHER) | (1L << LIRE) | (1L << REPETER) | (1L << MOINS) | (1L << POURCENTAGE) | (1L << BOOLEAN) | (1L << IDENTIFIANT) | (1L << ENTIER))) != 0) );
			setState(498);
			match(JUSQUE);
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(499);
				match(NEWLINE);
				}
				}
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(505);
			((ExprRepContext)_localctx).exprB = exprB(0);

			            ((ExprRepContext)_localctx).code =  repeterCode(instructions , ((ExprRepContext)_localctx).exprB.code);
			            moveSp(-1);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AffichageContext extends ParserRuleContext {
		public String code;
		public ExprRContext exprR;
		public TerminalNode AFFICHER() { return getToken(RationnelParser.AFFICHER, 0); }
		public TerminalNode PARENTHESE_G() { return getToken(RationnelParser.PARENTHESE_G, 0); }
		public ExprRContext exprR() {
			return getRuleContext(ExprRContext.class,0);
		}
		public TerminalNode PARENTHESE_D() { return getToken(RationnelParser.PARENTHESE_D, 0); }
		public AffichageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affichage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationnelListener ) ((RationnelListener)listener).enterAffichage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationnelListener ) ((RationnelListener)listener).exitAffichage(this);
		}
	}

	public final AffichageContext affichage() throws RecognitionException {
		AffichageContext _localctx = new AffichageContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_affichage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(AFFICHER);
			setState(509);
			match(PARENTHESE_G);
			setState(510);
			((AffichageContext)_localctx).exprR = exprR(0);
			setState(511);
			match(PARENTHESE_D);
			((AffichageContext)_localctx).code =   afficherCode(((AffichageContext)_localctx).exprR.code); moveSp(-2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinInstructionContext extends ParserRuleContext {
		public List<TerminalNode> POINT_VIRGULE() { return getTokens(RationnelParser.POINT_VIRGULE); }
		public TerminalNode POINT_VIRGULE(int i) {
			return getToken(RationnelParser.POINT_VIRGULE, i);
		}
		public FinInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationnelListener ) ((RationnelListener)listener).enterFinInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationnelListener ) ((RationnelListener)listener).exitFinInstruction(this);
		}
	}

	public final FinInstructionContext finInstruction() throws RecognitionException {
		FinInstructionContext _localctx = new FinInstructionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_finInstruction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(515); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(514);
					match(POINT_VIRGULE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(517); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return exprR_sempred((ExprRContext)_localctx, predIndex);
		case 6:
			return exprB_sempred((ExprBContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprR_sempred(ExprRContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 20);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean exprB_sempred(ExprBContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 11);
		case 10:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u020a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\7\2\"\n\2\f\2"+
		"\16\2%\13\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\7\2>\n\2\f\2\16\2"+
		"A\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\3\7\3O\n\3\f"+
		"\3\16\3R\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4l\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0081\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c4\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00f4\n\6\f\6\16\6\u00f7\13"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u013b\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u016f"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u017b\n\b\f\b\16\b\u017e"+
		"\13\b\3\t\3\t\3\t\7\t\u0183\n\t\f\t\16\t\u0186\13\t\3\t\3\t\7\t\u018a"+
		"\n\t\f\t\16\t\u018d\13\t\3\t\3\t\7\t\u0191\n\t\f\t\16\t\u0194\13\t\3\t"+
		"\3\t\7\t\u0198\n\t\f\t\16\t\u019b\13\t\3\t\3\t\7\t\u019f\n\t\f\t\16\t"+
		"\u01a2\13\t\3\t\3\t\3\t\7\t\u01a7\n\t\f\t\16\t\u01aa\13\t\3\t\3\t\7\t"+
		"\u01ae\n\t\f\t\16\t\u01b1\13\t\3\t\3\t\7\t\u01b5\n\t\f\t\16\t\u01b8\13"+
		"\t\3\t\3\t\7\t\u01bc\n\t\f\t\16\t\u01bf\13\t\3\t\3\t\7\t\u01c3\n\t\f\t"+
		"\16\t\u01c6\13\t\3\t\3\t\7\t\u01ca\n\t\f\t\16\t\u01cd\13\t\3\t\3\t\3\t"+
		"\5\t\u01d2\n\t\3\t\3\t\7\t\u01d6\n\t\f\t\16\t\u01d9\13\t\3\t\5\t\u01dc"+
		"\n\t\3\t\3\t\3\n\3\n\7\n\u01e2\n\n\f\n\16\n\u01e5\13\n\3\n\3\n\3\n\7\n"+
		"\u01ea\n\n\f\n\16\n\u01ed\13\n\3\n\3\n\6\n\u01f1\n\n\r\n\16\n\u01f2\3"+
		"\n\3\n\7\n\u01f7\n\n\f\n\16\n\u01fa\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\6\f\u0206\n\f\r\f\16\f\u0207\3\f\2\4\n\16\r\2\4\6\b"+
		"\n\f\16\20\22\24\26\2\2\2\u0251\2*\3\2\2\2\4D\3\2\2\2\6k\3\2\2\2\b\u0080"+
		"\3\2\2\2\n\u00c3\3\2\2\2\f\u013a\3\2\2\2\16\u016e\3\2\2\2\20\u017f\3\2"+
		"\2\2\22\u01df\3\2\2\2\24\u01fe\3\2\2\2\26\u0205\3\2\2\2\30\34\5\4\3\2"+
		"\31\33\7!\2\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2"+
		"\35\37\3\2\2\2\36\34\3\2\2\2\37#\5\26\f\2 \"\7!\2\2! \3\2\2\2\"%\3\2\2"+
		"\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\b\2\1\2\')\3\2\2\2(\30\3"+
		"\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+?\3\2\2\2,*\3\2\2\2-\61\5\6\4\2."+
		"\60\7!\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2"+
		"\2\2\63\61\3\2\2\2\648\5\26\f\2\65\67\7!\2\2\66\65\3\2\2\2\67:\3\2\2\2"+
		"8\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\b\2\1\2<>\3\2\2\2=-\3\2\2"+
		"\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\b\2\1\2C\3\3\2"+
		"\2\2DP\7\"\2\2EF\7$\2\2FJ\7\b\2\2GI\7!\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2"+
		"\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MO\b\3\1\2NE\3\2\2\2OR\3\2\2\2PN\3\2\2"+
		"\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7$\2\2TU\b\3\1\2U\5\3\2\2\2VW\5\b\5"+
		"\2WX\b\4\1\2Xl\3\2\2\2YZ\5\16\b\2Z[\b\4\1\2[l\3\2\2\2\\]\5\20\t\2]^\b"+
		"\4\1\2^l\3\2\2\2_`\5\f\7\2`a\b\4\1\2al\3\2\2\2bc\5\n\6\2cd\b\4\1\2dl\3"+
		"\2\2\2ef\5\22\n\2fg\b\4\1\2gl\3\2\2\2hi\5\24\13\2ij\b\4\1\2jl\3\2\2\2"+
		"kV\3\2\2\2kY\3\2\2\2k\\\3\2\2\2k_\3\2\2\2kb\3\2\2\2ke\3\2\2\2kh\3\2\2"+
		"\2l\7\3\2\2\2mn\7$\2\2no\7\30\2\2op\7\25\2\2p\u0081\b\5\1\2qr\7$\2\2r"+
		"s\7\30\2\2st\5\16\b\2tu\b\5\1\2u\u0081\3\2\2\2vw\7$\2\2wx\7\30\2\2xy\5"+
		"\f\7\2yz\b\5\1\2z\u0081\3\2\2\2{|\7$\2\2|}\7\30\2\2}~\5\n\6\2~\177\b\5"+
		"\1\2\177\u0081\3\2\2\2\u0080m\3\2\2\2\u0080q\3\2\2\2\u0080v\3\2\2\2\u0080"+
		"{\3\2\2\2\u0081\t\3\2\2\2\u0082\u0083\b\6\1\2\u0083\u0084\5\f\7\2\u0084"+
		"\u0085\7\34\2\2\u0085\u0086\5\f\7\2\u0086\u0087\b\6\1\2\u0087\u00c4\3"+
		"\2\2\2\u0088\u0089\7\4\2\2\u0089\u008a\5\n\6\2\u008a\u008b\7\5\2\2\u008b"+
		"\u008c\b\6\1\2\u008c\u00c4\3\2\2\2\u008d\u008e\7\33\2\2\u008e\u008f\5"+
		"\n\6\27\u008f\u0090\b\6\1\2\u0090\u00c4\3\2\2\2\u0091\u0092\5\f\7\2\u0092"+
		"\u0093\7\37\2\2\u0093\u0094\5\n\6\r\u0094\u0095\b\6\1\2\u0095\u00c4\3"+
		"\2\2\2\u0096\u0097\5\f\7\2\u0097\u0098\7 \2\2\u0098\u0099\5\n\6\f\u0099"+
		"\u009a\b\6\1\2\u009a\u00c4\3\2\2\2\u009b\u009c\5\f\7\2\u009c\u009d\7\36"+
		"\2\2\u009d\u009e\5\n\6\13\u009e\u009f\b\6\1\2\u009f\u00c4\3\2\2\2\u00a0"+
		"\u00a1\5\f\7\2\u00a1\u00a2\7\33\2\2\u00a2\u00a3\5\n\6\n\u00a3\u00a4\b"+
		"\6\1\2\u00a4\u00c4\3\2\2\2\u00a5\u00a6\5\f\7\2\u00a6\u00a7\7\37\2\2\u00a7"+
		"\u00a8\5\f\7\2\u00a8\u00a9\b\6\1\2\u00a9\u00c4\3\2\2\2\u00aa\u00ab\5\f"+
		"\7\2\u00ab\u00ac\7 \2\2\u00ac\u00ad\5\f\7\2\u00ad\u00ae\b\6\1\2\u00ae"+
		"\u00c4\3\2\2\2\u00af\u00b0\5\f\7\2\u00b0\u00b1\7\36\2\2\u00b1\u00b2\5"+
		"\f\7\2\u00b2\u00b3\b\6\1\2\u00b3\u00c4\3\2\2\2\u00b4\u00b5\5\f\7\2\u00b5"+
		"\u00b6\7\33\2\2\u00b6\u00b7\5\f\7\2\u00b7\u00b8\b\6\1\2\u00b8\u00c4\3"+
		"\2\2\2\u00b9\u00ba\7\23\2\2\u00ba\u00bb\7\4\2\2\u00bb\u00bc\5\n\6\2\u00bc"+
		"\u00bd\7\5\2\2\u00bd\u00be\b\6\1\2\u00be\u00c4\3\2\2\2\u00bf\u00c0\7$"+
		"\2\2\u00c0\u00c4\b\6\1\2\u00c1\u00c2\7\25\2\2\u00c2\u00c4\b\6\1\2\u00c3"+
		"\u0082\3\2\2\2\u00c3\u0088\3\2\2\2\u00c3\u008d\3\2\2\2\u00c3\u0091\3\2"+
		"\2\2\u00c3\u0096\3\2\2\2\u00c3\u009b\3\2\2\2\u00c3\u00a0\3\2\2\2\u00c3"+
		"\u00a5\3\2\2\2\u00c3\u00aa\3\2\2\2\u00c3\u00af\3\2\2\2\u00c3\u00b4\3\2"+
		"\2\2\u00c3\u00b9\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00f5\3\2\2\2\u00c5\u00c6\f\25\2\2\u00c6\u00c7\7\37\2\2\u00c7\u00c8\5"+
		"\n\6\26\u00c8\u00c9\b\6\1\2\u00c9\u00f4\3\2\2\2\u00ca\u00cb\f\24\2\2\u00cb"+
		"\u00cc\7 \2\2\u00cc\u00cd\5\n\6\25\u00cd\u00ce\b\6\1\2\u00ce\u00f4\3\2"+
		"\2\2\u00cf\u00d0\f\23\2\2\u00d0\u00d1\7\36\2\2\u00d1\u00d2\5\n\6\24\u00d2"+
		"\u00d3\b\6\1\2\u00d3\u00f4\3\2\2\2\u00d4\u00d5\f\22\2\2\u00d5\u00d6\7"+
		"\33\2\2\u00d6\u00d7\5\n\6\23\u00d7\u00d8\b\6\1\2\u00d8\u00f4\3\2\2\2\u00d9"+
		"\u00da\f\26\2\2\u00da\u00db\7\37\2\2\u00db\u00dc\7\37\2\2\u00dc\u00dd"+
		"\5\f\7\2\u00dd\u00de\b\6\1\2\u00de\u00f4\3\2\2\2\u00df\u00e0\f\21\2\2"+
		"\u00e0\u00e1\7\37\2\2\u00e1\u00e2\5\f\7\2\u00e2\u00e3\b\6\1\2\u00e3\u00f4"+
		"\3\2\2\2\u00e4\u00e5\f\20\2\2\u00e5\u00e6\7 \2\2\u00e6\u00e7\5\f\7\2\u00e7"+
		"\u00e8\b\6\1\2\u00e8\u00f4\3\2\2\2\u00e9\u00ea\f\17\2\2\u00ea\u00eb\7"+
		"\36\2\2\u00eb\u00ec\5\f\7\2\u00ec\u00ed\b\6\1\2\u00ed\u00f4\3\2\2\2\u00ee"+
		"\u00ef\f\16\2\2\u00ef\u00f0\7\33\2\2\u00f0\u00f1\5\f\7\2\u00f1\u00f2\b"+
		"\6\1\2\u00f2\u00f4\3\2\2\2\u00f3\u00c5\3\2\2\2\u00f3\u00ca\3\2\2\2\u00f3"+
		"\u00cf\3\2\2\2\u00f3\u00d4\3\2\2\2\u00f3\u00d9\3\2\2\2\u00f3\u00df\3\2"+
		"\2\2\u00f3\u00e4\3\2\2\2\u00f3\u00e9\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f4"+
		"\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\13\3\2\2"+
		"\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7\4\2\2\u00f9\u00fa\5\f\7\2\u00fa\u00fb"+
		"\7\5\2\2\u00fb\u00fc\b\7\1\2\u00fc\u013b\3\2\2\2\u00fd\u00fe\7\33\2\2"+
		"\u00fe\u00ff\5\f\7\2\u00ff\u0100\b\7\1\2\u0100\u013b\3\2\2\2\u0101\u0102"+
		"\7\17\2\2\u0102\u0103\7\4\2\2\u0103\u0104\5\f\7\2\u0104\u0105\7\b\2\2"+
		"\u0105\u0106\5\f\7\2\u0106\u0107\7\5\2\2\u0107\u0108\b\7\1\2\u0108\u013b"+
		"\3\2\2\2\u0109\u010a\7\20\2\2\u010a\u010b\7\4\2\2\u010b\u010c\5\f\7\2"+
		"\u010c\u010d\7\b\2\2\u010d\u010e\5\f\7\2\u010e\u010f\7\5\2\2\u010f\u0110"+
		"\b\7\1\2\u0110\u013b\3\2\2\2\u0111\u0112\7\21\2\2\u0112\u0113\7\4\2\2"+
		"\u0113\u0114\5\n\6\2\u0114\u0115\7\5\2\2\u0115\u0116\b\7\1\2\u0116\u013b"+
		"\3\2\2\2\u0117\u0118\7\22\2\2\u0118\u0119\7\4\2\2\u0119\u011a\5\n\6\2"+
		"\u011a\u011b\7\5\2\2\u011b\u011c\b\7\1\2\u011c\u013b\3\2\2\2\u011d\u011e"+
		"\7\35\2\2\u011e\u011f\5\n\6\2\u011f\u0120\b\7\1\2\u0120\u013b\3\2\2\2"+
		"\u0121\u0122\7\6\2\2\u0122\u0123\5\n\6\2\u0123\u0124\7\7\2\2\u0124\u0125"+
		"\b\7\1\2\u0125\u013b\3\2\2\2\u0126\u0127\7\6\2\2\u0127\u0128\7\36\2\2"+
		"\u0128\u0129\5\n\6\2\u0129\u012a\7\36\2\2\u012a\u012b\7\7\2\2\u012b\u012c"+
		"\b\7\1\2\u012c\u013b\3\2\2\2\u012d\u012e\7\6\2\2\u012e\u012f\7\33\2\2"+
		"\u012f\u0130\5\n\6\2\u0130\u0131\7\33\2\2\u0131\u0132\7\7\2\2\u0132\u0133"+
		"\b\7\1\2\u0133\u013b\3\2\2\2\u0134\u0135\7&\2\2\u0135\u013b\b\7\1\2\u0136"+
		"\u0137\7$\2\2\u0137\u013b\b\7\1\2\u0138\u0139\7\25\2\2\u0139\u013b\b\7"+
		"\1\2\u013a\u00f8\3\2\2\2\u013a\u00fd\3\2\2\2\u013a\u0101\3\2\2\2\u013a"+
		"\u0109\3\2\2\2\u013a\u0111\3\2\2\2\u013a\u0117\3\2\2\2\u013a\u011d\3\2"+
		"\2\2\u013a\u0121\3\2\2\2\u013a\u0126\3\2\2\2\u013a\u012d\3\2\2\2\u013a"+
		"\u0134\3\2\2\2\u013a\u0136\3\2\2\2\u013a\u0138\3\2\2\2\u013b\r\3\2\2\2"+
		"\u013c\u013d\b\b\1\2\u013d\u013e\7\16\2\2\u013e\u013f\5\16\b\17\u013f"+
		"\u0140\b\b\1\2\u0140\u016f\3\2\2\2\u0141\u0142\7\4\2\2\u0142\u0143\5\16"+
		"\b\2\u0143\u0144\7\5\2\2\u0144\u0145\b\b\1\2\u0145\u016f\3\2\2\2\u0146"+
		"\u0147\5\n\6\2\u0147\u0148\7\30\2\2\u0148\u0149\7\30\2\2\u0149\u014a\5"+
		"\n\6\2\u014a\u014b\b\b\1\2\u014b\u016f\3\2\2\2\u014c\u014d\5\n\6\2\u014d"+
		"\u014e\7\32\2\2\u014e\u014f\7\31\2\2\u014f\u0150\5\n\6\2\u0150\u0151\b"+
		"\b\1\2\u0151\u016f\3\2\2\2\u0152\u0153\5\n\6\2\u0153\u0154\7\32\2\2\u0154"+
		"\u0155\5\n\6\2\u0155\u0156\b\b\1\2\u0156\u016f\3\2\2\2\u0157\u0158\5\n"+
		"\6\2\u0158\u0159\7\31\2\2\u0159\u015a\5\n\6\2\u015a\u015b\b\b\1\2\u015b"+
		"\u016f\3\2\2\2\u015c\u015d\5\n\6\2\u015d\u015e\7\32\2\2\u015e\u015f\7"+
		"\30\2\2\u015f\u0160\5\n\6\2\u0160\u0161\b\b\1\2\u0161\u016f\3\2\2\2\u0162"+
		"\u0163\5\n\6\2\u0163\u0164\7\31\2\2\u0164\u0165\7\30\2\2\u0165\u0166\5"+
		"\n\6\2\u0166\u0167\b\b\1\2\u0167\u016f\3\2\2\2\u0168\u0169\7#\2\2\u0169"+
		"\u016f\b\b\1\2\u016a\u016b\7$\2\2\u016b\u016f\b\b\1\2\u016c\u016d\7\25"+
		"\2\2\u016d\u016f\b\b\1\2\u016e\u013c\3\2\2\2\u016e\u0141\3\2\2\2\u016e"+
		"\u0146\3\2\2\2\u016e\u014c\3\2\2\2\u016e\u0152\3\2\2\2\u016e\u0157\3\2"+
		"\2\2\u016e\u015c\3\2\2\2\u016e\u0162\3\2\2\2\u016e\u0168\3\2\2\2\u016e"+
		"\u016a\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u017c\3\2\2\2\u0170\u0171\f\r"+
		"\2\2\u0171\u0172\7\f\2\2\u0172\u0173\5\16\b\16\u0173\u0174\b\b\1\2\u0174"+
		"\u017b\3\2\2\2\u0175\u0176\f\f\2\2\u0176\u0177\7\r\2\2\u0177\u0178\5\16"+
		"\b\r\u0178\u0179\b\b\1\2\u0179\u017b\3\2\2\2\u017a\u0170\3\2\2\2\u017a"+
		"\u0175\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\17\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\5\16\b\2\u0180\u0184"+
		"\7\13\2\2\u0181\u0183\7!\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184"+
		"\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2"+
		"\2\2\u0187\u018b\7\t\2\2\u0188\u018a\7!\2\2\u0189\u0188\3\2\2\2\u018a"+
		"\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u01a0\3\2"+
		"\2\2\u018d\u018b\3\2\2\2\u018e\u0192\5\6\4\2\u018f\u0191\7!\2\2\u0190"+
		"\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0199\5\26\f\2\u0196"+
		"\u0198\7!\2\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2"+
		"\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c"+
		"\u019d\b\t\1\2\u019d\u019f\3\2\2\2\u019e\u018e\3\2\2\2\u019f\u01a2\3\2"+
		"\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a3\u01a4\b\t\1\2\u01a4\u01a8\7\n\2\2\u01a5\u01a7\7!"+
		"\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01db\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01af\7 "+
		"\2\2\u01ac\u01ae\7!\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af"+
		"\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01af\3\2"+
		"\2\2\u01b2\u01b6\7\t\2\2\u01b3\u01b5\7!\2\2\u01b4\u01b3\3\2\2\2\u01b5"+
		"\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01d1\3\2"+
		"\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01bd\5\6\4\2\u01ba\u01bc\7!\2\2\u01bb"+
		"\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2"+
		"\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c4\5\26\f\2\u01c1"+
		"\u01c3\7!\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2"+
		"\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7"+
		"\u01c8\b\t\1\2\u01c8\u01ca\3\2\2\2\u01c9\u01b9\3\2\2\2\u01ca\u01cd\3\2"+
		"\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01d2\3\2\2\2\u01cd"+
		"\u01cb\3\2\2\2\u01ce\u01cf\5\20\t\2\u01cf\u01d0\b\t\1\2\u01d0\u01d2\3"+
		"\2\2\2\u01d1\u01cb\3\2\2\2\u01d1\u01ce\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d7\7\n\2\2\u01d4\u01d6\7!\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d9\3\2"+
		"\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01dc\3\2\2\2\u01d9"+
		"\u01d7\3\2\2\2\u01da\u01dc\5\26\f\2\u01db\u01ab\3\2\2\2\u01db\u01da\3"+
		"\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\b\t\1\2\u01de"+
		"\21\3\2\2\2\u01df\u01e3\7\26\2\2\u01e0\u01e2\7!\2\2\u01e1\u01e0\3\2\2"+
		"\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01f0"+
		"\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e7\5\6\4\2\u01e7\u01eb\5\26\f\2"+
		"\u01e8\u01ea\7!\2\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee"+
		"\u01ef\b\n\1\2\u01ef\u01f1\3\2\2\2\u01f0\u01e6\3\2\2\2\u01f1\u01f2\3\2"+
		"\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"\u01f8\7\27\2\2\u01f5\u01f7\7!\2\2\u01f6\u01f5\3\2\2\2\u01f7\u01fa\3\2"+
		"\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa"+
		"\u01f8\3\2\2\2\u01fb\u01fc\5\16\b\2\u01fc\u01fd\b\n\1\2\u01fd\23\3\2\2"+
		"\2\u01fe\u01ff\7\24\2\2\u01ff\u0200\7\4\2\2\u0200\u0201\5\n\6\2\u0201"+
		"\u0202\7\5\2\2\u0202\u0203\b\13\1\2\u0203\25\3\2\2\2\u0204\u0206\7\3\2"+
		"\2\u0205\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208"+
		"\3\2\2\2\u0208\27\3\2\2\2&\34#*\618?JPk\u0080\u00c3\u00f3\u00f5\u013a"+
		"\u016e\u017a\u017c\u0184\u018b\u0192\u0199\u01a0\u01a8\u01af\u01b6\u01bd"+
		"\u01c4\u01cb\u01d1\u01d7\u01db\u01e3\u01eb\u01f2\u01f8\u0207";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}