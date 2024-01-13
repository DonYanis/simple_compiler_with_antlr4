# Compiler with ANTLR4 & MVaP

### The grammar is made with anltr4, a powerful parser generator in Java, the compiler is executed using JVM. 
### The output is MVaP code (machine code using just a Stack )

* Example of print(1+2) in MVaP code
```
PUSHI 1
PUSHI 2
ADD
WRITE
POP
HALT
```
## Installing antlr4 and mvap
# ANTLR4

## Installation Instructions:

1. Create a directory named 'bin' in home directory.
2. Copy the .jar file `antlr-4.9.2-complete.jar` into the 'bin' directory.
3. In terminal configuration file add the following lines:

    ```bash
    export CLASSPATH=.:~/bin/antlr-4.9.2-complete.jar:$CLASSPATH

    alias antlr4='java -Xmx500M -cp "~/bin/antlr-4.9.2-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
    alias grun='java -Xmx500M -cp "~/bin/antlr-4.9.2-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig'
    ```

## Basic Usage of ANTLR:

1. Run the following commands to generate the parser and lexer classes from grammar file (`Test.g4`):

    ```bash
    $ antlr4 Test.g4
    $ javac Test*.java
    ```

2. Execute the file containing the main method (after compiling it) or use the `grun` alias for testing.


# MVaP

## Installation Instructions:

1. Download the file `bin/sources-MVaP-2.1.zip` and unzip it.

2. Navigate to the `sources-MVaP-2.1` directory and execute the following commands :
    ```bash
    $ antlr4 MVaP.g4
    $ javac *.java
    ```

3. Modify the file `META-INF/MANIFEST.MF` to provide the full path to ANTLR, then execute the following command:

    ```bash
    $ jar cfm MVaP.jar META-INF/MANIFEST.MF *.class
    ```

4. Update the CLASSPATH variable to indicate the location of the `MVaP.jar` file
    ```bash
    export CLASSPATH=.:/home/bin/antlr/antlr-4.9.2-complete.jar:/home/bin/mvap/MVaP.jar
    ```

## Usage of the Link Editor and MVaP Simulator:

- To assemble source code in `C.mvap` (containing only MVaP instructions):

    ```bash
    $ java -cp $CLASSPATH MVaPAssembler C.mvap
    ```

    (It will create a file `C.mvap.cbap`, which is the executable code.)

- To execute it (assuming `MVaP.jar` is located in `$HOME/bin/`):

    ```bash
    $ java -jar $HOME/bin/MVaP.jar C.mvap.cbap
    ```

    (Or `java -jar $HOME/bin/MVaP.jar -d C.mvap.cbap` for debug mode.)


# Using the Rationnel compiler 
### Tests are in "/tests"
* example : 
    ```bash
    rationnel x,y;
    x = 1/1;
    y = 1/1;

    repeter
        repeter
            y = y * pgcd(8,6);
        jusque y>8/1;
        y = y + 1;
        x = x+1;
    jusque x>5/1;

    afficher(x);

    true ? {
        afficher(y);
    };
    ```

1.  Generating lexer and parser Java files based on the rules defined in the grammar file (Rationnel.g4), then Java Compilation with javac : 

    ```bash
    antlr4 Rationnel.g4 && javac Rationnel*.java
    ```

2. Runnig a test code and generating MVaP source code
    ```bash
    cat test1 | grun Rationnel start  > c.mvap
    ```
3. Assembling source code and executing it : 
    ```bash
    java -cp $CLASSPATH MVaPAssembler c.mvap &&  java -jar $HOME/bin/mvap/MVaP.jar  c.mvap.cbap
    ```