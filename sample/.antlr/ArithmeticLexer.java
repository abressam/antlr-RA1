// Generated from c:/Users/amand/Desktop/antlr-RA1/sample/Arithmetic.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ArithmeticLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		INT=10, NEGATIVE_INT=11, ZERO=12, FLOAT=13, NEGATIVE_FLOAT=14, MEM=15, 
		RES=16, NEWLINE=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"INT", "NEGATIVE_INT", "ZERO", "FLOAT", "NEGATIVE_FLOAT", "MEM", "RES", 
			"NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'+'", "'-'", "'*'", "'|'", "'/'", "'%'", "'^'", 
			null, null, "'0'", null, null, "'MEM'", "'RES'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "INT", "NEGATIVE_INT", 
			"ZERO", "FLOAT", "NEGATIVE_FLOAT", "MEM", "RES", "NEWLINE", "WS"
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


	public ArithmeticLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Arithmetic.g4"; }

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
		"\u0004\u0000\u0012f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0005\t:\b\t\n\t\f\t=\t\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0004\fE\b\f\u000b\f\f\fF\u0001\f\u0001\f\u0005\fK\b\f"+
		"\n\f\f\fN\t\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0004\u0010\\\b\u0010\u000b\u0010\f\u0010]\u0001\u0011\u0004\u0011a\b"+
		"\u0011\u000b\u0011\f\u0011b\u0001\u0011\u0001\u0011\u0000\u0000\u0012"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0004\u0001\u00001"+
		"9\u0001\u000009\u0002\u0000\n\n\r\r\u0002\u0000\t\t  j\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003\'"+
		"\u0001\u0000\u0000\u0000\u0005)\u0001\u0000\u0000\u0000\u0007+\u0001\u0000"+
		"\u0000\u0000\t-\u0001\u0000\u0000\u0000\u000b/\u0001\u0000\u0000\u0000"+
		"\r1\u0001\u0000\u0000\u0000\u000f3\u0001\u0000\u0000\u0000\u00115\u0001"+
		"\u0000\u0000\u0000\u00137\u0001\u0000\u0000\u0000\u0015>\u0001\u0000\u0000"+
		"\u0000\u0017A\u0001\u0000\u0000\u0000\u0019D\u0001\u0000\u0000\u0000\u001b"+
		"O\u0001\u0000\u0000\u0000\u001dR\u0001\u0000\u0000\u0000\u001fV\u0001"+
		"\u0000\u0000\u0000![\u0001\u0000\u0000\u0000#`\u0001\u0000\u0000\u0000"+
		"%&\u0005(\u0000\u0000&\u0002\u0001\u0000\u0000\u0000\'(\u0005)\u0000\u0000"+
		"(\u0004\u0001\u0000\u0000\u0000)*\u0005+\u0000\u0000*\u0006\u0001\u0000"+
		"\u0000\u0000+,\u0005-\u0000\u0000,\b\u0001\u0000\u0000\u0000-.\u0005*"+
		"\u0000\u0000.\n\u0001\u0000\u0000\u0000/0\u0005|\u0000\u00000\f\u0001"+
		"\u0000\u0000\u000012\u0005/\u0000\u00002\u000e\u0001\u0000\u0000\u0000"+
		"34\u0005%\u0000\u00004\u0010\u0001\u0000\u0000\u000056\u0005^\u0000\u0000"+
		"6\u0012\u0001\u0000\u0000\u00007;\u0007\u0000\u0000\u00008:\u0007\u0001"+
		"\u0000\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\u0014\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000>?\u0005-\u0000\u0000?@\u0003\u0013\t"+
		"\u0000@\u0016\u0001\u0000\u0000\u0000AB\u00050\u0000\u0000B\u0018\u0001"+
		"\u0000\u0000\u0000CE\u0007\u0001\u0000\u0000DC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HL\u0005.\u0000\u0000IK\u0007\u0001\u0000"+
		"\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000M\u001a\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000OP\u0005-\u0000\u0000PQ\u0003\u0019\f\u0000"+
		"Q\u001c\u0001\u0000\u0000\u0000RS\u0005M\u0000\u0000ST\u0005E\u0000\u0000"+
		"TU\u0005M\u0000\u0000U\u001e\u0001\u0000\u0000\u0000VW\u0005R\u0000\u0000"+
		"WX\u0005E\u0000\u0000XY\u0005S\u0000\u0000Y \u0001\u0000\u0000\u0000Z"+
		"\\\u0007\u0002\u0000\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\"\u0001\u0000"+
		"\u0000\u0000_a\u0007\u0003\u0000\u0000`_\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000de\u0006\u0011\u0000\u0000e$\u0001\u0000\u0000"+
		"\u0000\u0006\u0000;FL]b\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}