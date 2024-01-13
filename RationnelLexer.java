// Generated from Rationnel.g4 by ANTLR 4.9.2

    import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RationnelLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"POINT_VIRGULE", "PARENTHESE_G", "PARENTHESE_D", "CROCHET_G", "CROCHET_D", 
			"VIRGULE", "ACCOLADE_G", "ACCOLADE_D", "POINT_INTERRO", "AND", "OR", 
			"NOT", "PGCD", "PPCM", "DENUM", "NUM", "SIM", "AFFICHER", "LIRE", "REPETER", 
			"JUSQUE", "EGALE", "SUPP", "INF", "MOINS", "SLASH", "POURCENTAGE", "PLUS", 
			"ETOILE", "DPOINTS", "NEWLINE", "TYPE", "BOOLEAN", "IDENTIFIANT", "WS", 
			"ENTIER", "COMMENTAIRE"
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


	public RationnelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Rationnel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00f8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \5 \u00b5\n \3 \3 \5 \u00b9\n \3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u00cb\n!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u00d6\n\"\3#\3#\7#\u00da\n#\f#\16#\u00dd\13#"+
		"\3$\6$\u00e0\n$\r$\16$\u00e1\3$\3$\3%\6%\u00e7\n%\r%\16%\u00e8\3&\3&\3"+
		"&\3&\7&\u00ef\n&\f&\16&\u00f2\13&\3&\3&\3&\3&\3&\3\u00f0\2\'\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\3\2\62;\2\u0100"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13"+
		"U\3\2\2\2\rW\3\2\2\2\17Y\3\2\2\2\21[\3\2\2\2\23]\3\2\2\2\25_\3\2\2\2\27"+
		"c\3\2\2\2\31f\3\2\2\2\33j\3\2\2\2\35o\3\2\2\2\37t\3\2\2\2!z\3\2\2\2#~"+
		"\3\2\2\2%\u0082\3\2\2\2\'\u008b\3\2\2\2)\u0092\3\2\2\2+\u009a\3\2\2\2"+
		"-\u00a1\3\2\2\2/\u00a3\3\2\2\2\61\u00a5\3\2\2\2\63\u00a7\3\2\2\2\65\u00a9"+
		"\3\2\2\2\67\u00ab\3\2\2\29\u00ad\3\2\2\2;\u00af\3\2\2\2=\u00b1\3\2\2\2"+
		"?\u00b8\3\2\2\2A\u00ca\3\2\2\2C\u00d5\3\2\2\2E\u00d7\3\2\2\2G\u00df\3"+
		"\2\2\2I\u00e6\3\2\2\2K\u00ea\3\2\2\2MN\7=\2\2N\4\3\2\2\2OP\7*\2\2P\6\3"+
		"\2\2\2QR\7+\2\2R\b\3\2\2\2ST\7]\2\2T\n\3\2\2\2UV\7_\2\2V\f\3\2\2\2WX\7"+
		".\2\2X\16\3\2\2\2YZ\7}\2\2Z\20\3\2\2\2[\\\7\177\2\2\\\22\3\2\2\2]^\7A"+
		"\2\2^\24\3\2\2\2_`\7c\2\2`a\7p\2\2ab\7f\2\2b\26\3\2\2\2cd\7q\2\2de\7t"+
		"\2\2e\30\3\2\2\2fg\7p\2\2gh\7q\2\2hi\7v\2\2i\32\3\2\2\2jk\7r\2\2kl\7i"+
		"\2\2lm\7e\2\2mn\7f\2\2n\34\3\2\2\2op\7r\2\2pq\7r\2\2qr\7e\2\2rs\7o\2\2"+
		"s\36\3\2\2\2tu\7f\2\2uv\7g\2\2vw\7p\2\2wx\7w\2\2xy\7o\2\2y \3\2\2\2z{"+
		"\7p\2\2{|\7w\2\2|}\7o\2\2}\"\3\2\2\2~\177\7u\2\2\177\u0080\7k\2\2\u0080"+
		"\u0081\7o\2\2\u0081$\3\2\2\2\u0082\u0083\7c\2\2\u0083\u0084\7h\2\2\u0084"+
		"\u0085\7h\2\2\u0085\u0086\7k\2\2\u0086\u0087\7e\2\2\u0087\u0088\7j\2\2"+
		"\u0088\u0089\7g\2\2\u0089\u008a\7t\2\2\u008a&\3\2\2\2\u008b\u008c\7n\2"+
		"\2\u008c\u008d\7k\2\2\u008d\u008e\7t\2\2\u008e\u008f\7g\2\2\u008f\u0090"+
		"\7*\2\2\u0090\u0091\7+\2\2\u0091(\3\2\2\2\u0092\u0093\7t\2\2\u0093\u0094"+
		"\7g\2\2\u0094\u0095\7r\2\2\u0095\u0096\7g\2\2\u0096\u0097\7v\2\2\u0097"+
		"\u0098\7g\2\2\u0098\u0099\7t\2\2\u0099*\3\2\2\2\u009a\u009b\7l\2\2\u009b"+
		"\u009c\7w\2\2\u009c\u009d\7u\2\2\u009d\u009e\7s\2\2\u009e\u009f\7w\2\2"+
		"\u009f\u00a0\7g\2\2\u00a0,\3\2\2\2\u00a1\u00a2\7?\2\2\u00a2.\3\2\2\2\u00a3"+
		"\u00a4\7@\2\2\u00a4\60\3\2\2\2\u00a5\u00a6\7>\2\2\u00a6\62\3\2\2\2\u00a7"+
		"\u00a8\7/\2\2\u00a8\64\3\2\2\2\u00a9\u00aa\7\61\2\2\u00aa\66\3\2\2\2\u00ab"+
		"\u00ac\7\'\2\2\u00ac8\3\2\2\2\u00ad\u00ae\7-\2\2\u00ae:\3\2\2\2\u00af"+
		"\u00b0\7,\2\2\u00b0<\3\2\2\2\u00b1\u00b2\7<\2\2\u00b2>\3\2\2\2\u00b3\u00b5"+
		"\7\17\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2"+
		"\u00b6\u00b9\7\f\2\2\u00b7\u00b9\7\17\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9@\3\2\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7p\2\2\u00bc\u00cb"+
		"\7v\2\2\u00bd\u00be\7d\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7q\2\2\u00c0"+
		"\u00cb\7n\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7v\2\2"+
		"\u00c4\u00c5\7k\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8"+
		"\7p\2\2\u00c8\u00c9\7g\2\2\u00c9\u00cb\7n\2\2\u00ca\u00ba\3\2\2\2\u00ca"+
		"\u00bd\3\2\2\2\u00ca\u00c1\3\2\2\2\u00cbB\3\2\2\2\u00cc\u00cd\7v\2\2\u00cd"+
		"\u00ce\7t\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d6\7g\2\2\u00d0\u00d1\7h\2\2"+
		"\u00d1\u00d2\7c\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d6"+
		"\7g\2\2\u00d5\u00cc\3\2\2\2\u00d5\u00d0\3\2\2\2\u00d6D\3\2\2\2\u00d7\u00db"+
		"\t\2\2\2\u00d8\u00da\t\3\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dcF\3\2\2\2\u00dd\u00db\3\2\2\2"+
		"\u00de\u00e0\t\4\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\b$\2\2\u00e4"+
		"H\3\2\2\2\u00e5\u00e7\t\5\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9J\3\2\2\2\u00ea\u00eb\7"+
		"\61\2\2\u00eb\u00ec\7,\2\2\u00ec\u00f0\3\2\2\2\u00ed\u00ef\13\2\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7,\2\2\u00f4"+
		"\u00f5\7\61\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\b&\2\2\u00f7L\3\2\2\2"+
		"\13\2\u00b4\u00b8\u00ca\u00d5\u00db\u00e1\u00e8\u00f0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}