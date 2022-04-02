// Generated from C:/Users/pilip/Desktop/trycatch\TryCatchLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TryCatchLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LEFT_OVAL_BRACKET=1, RIGHT_OVAL_BRACKET=2, LEFT_CURLY_BRACKET=3, RIGHT_CURLY_BRACKET=4, 
		DOT=5, BIT_OR=6, SEMICOLON=7, ASSIGN=8, VAR=9, NEW=10, TRY=11, CATCH=12, 
		FINALLY=13, IDENTIFIER=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LEFT_OVAL_BRACKET", "RIGHT_OVAL_BRACKET", "LEFT_CURLY_BRACKET", "RIGHT_CURLY_BRACKET", 
			"DOT", "BIT_OR", "SEMICOLON", "ASSIGN", "VAR", "NEW", "TRY", "CATCH", 
			"FINALLY", "IDENTIFIER", "WS", "LetterOrDigit", "Letter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'.'", "'|'", "';'", "'='", "'var'", 
			"'new'", "'try'", "'catch'", "'finally'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LEFT_OVAL_BRACKET", "RIGHT_OVAL_BRACKET", "LEFT_CURLY_BRACKET", 
			"RIGHT_CURLY_BRACKET", "DOT", "BIT_OR", "SEMICOLON", "ASSIGN", "VAR", 
			"NEW", "TRY", "CATCH", "FINALLY", "IDENTIFIER", "WS"
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


	public TryCatchLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TryCatchLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21g\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\7\17R\n\17\f\17\16"+
		"\17U\13\17\3\20\6\20X\n\20\r\20\16\20Y\3\20\3\20\3\21\3\21\5\21`\n\21"+
		"\3\22\3\22\3\22\3\22\5\22f\n\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\2#\2\3\2\b\5\2\13\f\16\17"+
		"\"\"\3\2\62;\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01\3\2"+
		"\udc02\ue001\2i\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3%\3"+
		"\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r/\3\2\2\2\17\61"+
		"\3\2\2\2\21\63\3\2\2\2\23\65\3\2\2\2\259\3\2\2\2\27=\3\2\2\2\31A\3\2\2"+
		"\2\33G\3\2\2\2\35O\3\2\2\2\37W\3\2\2\2!_\3\2\2\2#e\3\2\2\2%&\7*\2\2&\4"+
		"\3\2\2\2\'(\7+\2\2(\6\3\2\2\2)*\7}\2\2*\b\3\2\2\2+,\7\177\2\2,\n\3\2\2"+
		"\2-.\7\60\2\2.\f\3\2\2\2/\60\7~\2\2\60\16\3\2\2\2\61\62\7=\2\2\62\20\3"+
		"\2\2\2\63\64\7?\2\2\64\22\3\2\2\2\65\66\7x\2\2\66\67\7c\2\2\678\7t\2\2"+
		"8\24\3\2\2\29:\7p\2\2:;\7g\2\2;<\7y\2\2<\26\3\2\2\2=>\7v\2\2>?\7t\2\2"+
		"?@\7{\2\2@\30\3\2\2\2AB\7e\2\2BC\7c\2\2CD\7v\2\2DE\7e\2\2EF\7j\2\2F\32"+
		"\3\2\2\2GH\7h\2\2HI\7k\2\2IJ\7p\2\2JK\7c\2\2KL\7n\2\2LM\7n\2\2MN\7{\2"+
		"\2N\34\3\2\2\2OS\5#\22\2PR\5!\21\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2"+
		"\2\2T\36\3\2\2\2US\3\2\2\2VX\t\2\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3"+
		"\2\2\2Z[\3\2\2\2[\\\b\20\2\2\\ \3\2\2\2]`\5#\22\2^`\t\3\2\2_]\3\2\2\2"+
		"_^\3\2\2\2`\"\3\2\2\2af\t\4\2\2bf\n\5\2\2cd\t\6\2\2df\t\7\2\2ea\3\2\2"+
		"\2eb\3\2\2\2ec\3\2\2\2f$\3\2\2\2\7\2SY_e\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}