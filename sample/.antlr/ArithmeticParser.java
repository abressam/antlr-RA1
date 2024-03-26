// Generated from c:/Users/amand/Desktop/antlr-RA1/sample/Arithmetic.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ArithmeticParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		INT=10, NEGATIVE_INT=11, ZERO=12, FLOAT=13, MEM=14, RES=15, NEWLINE=16, 
		WS=17;
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_operation = 2, RULE_operator = 3, RULE_number = 4, 
		RULE_integer = 5, RULE_nonzero = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expr", "operation", "operator", "number", "integer", "nonzero"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'+'", "'-'", "'*'", "'|'", "'/'", "'%'", "'^'", 
			null, null, "'0'", null, "'MEM'", "'RES'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "INT", "NEGATIVE_INT", 
			"ZERO", "FLOAT", "MEM", "RES", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Arithmetic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArithmeticParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ArithmeticParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ArithmeticParser.NEWLINE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(14);
				expr();
				setState(15);
				match(NEWLINE);
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public List<NonzeroContext> nonzero() {
			return getRuleContexts(NonzeroContext.class);
		}
		public NonzeroContext nonzero(int i) {
			return getRuleContext(NonzeroContext.class,i);
		}
		public TerminalNode MEM() { return getToken(ArithmeticParser.MEM, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode RES() { return getToken(ArithmeticParser.RES, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(T__0);
				setState(23);
				operation();
				setState(24);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(T__0);
				setState(27);
				number();
				setState(28);
				number();
				setState(29);
				match(T__2);
				setState(30);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(T__0);
				setState(33);
				number();
				setState(34);
				number();
				setState(35);
				match(T__3);
				setState(36);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				match(T__0);
				setState(39);
				number();
				setState(40);
				number();
				setState(41);
				match(T__4);
				setState(42);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				match(T__0);
				setState(45);
				number();
				setState(46);
				number();
				setState(47);
				match(T__5);
				setState(48);
				match(T__1);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				match(T__0);
				setState(51);
				integer();
				setState(52);
				nonzero();
				setState(53);
				match(T__6);
				setState(54);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(56);
				match(T__0);
				setState(57);
				nonzero();
				setState(58);
				nonzero();
				setState(59);
				match(T__6);
				setState(60);
				match(T__1);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(62);
				match(T__0);
				setState(63);
				integer();
				setState(64);
				integer();
				setState(65);
				match(T__7);
				setState(66);
				match(T__1);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(68);
				match(T__0);
				setState(69);
				nonzero();
				setState(70);
				nonzero();
				setState(71);
				match(T__7);
				setState(72);
				match(T__1);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(74);
				match(T__0);
				setState(75);
				number();
				setState(76);
				integer();
				setState(77);
				match(T__8);
				setState(78);
				match(T__1);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(80);
				match(T__0);
				setState(81);
				number();
				setState(82);
				match(MEM);
				setState(83);
				match(T__1);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(85);
				match(T__0);
				setState(86);
				number();
				setState(87);
				match(MEM);
				setState(88);
				expr();
				setState(89);
				operator();
				setState(90);
				match(T__1);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(92);
				match(T__0);
				setState(93);
				match(MEM);
				setState(94);
				match(T__1);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(95);
				match(T__0);
				setState(96);
				expr();
				setState(97);
				match(MEM);
				setState(98);
				match(T__1);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(100);
				match(T__0);
				setState(101);
				match(MEM);
				setState(102);
				expr();
				setState(103);
				match(T__1);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(105);
				match(T__0);
				setState(106);
				match(MEM);
				setState(107);
				expr();
				setState(108);
				operator();
				setState(109);
				match(T__1);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(111);
				match(T__0);
				setState(112);
				integer();
				setState(113);
				match(RES);
				setState(114);
				match(T__1);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(116);
				match(T__0);
				setState(117);
				integer();
				setState(118);
				match(RES);
				setState(119);
				expr();
				setState(120);
				match(T__1);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(122);
				match(T__0);
				setState(123);
				number();
				setState(124);
				expr();
				setState(125);
				operator();
				setState(126);
				match(T__1);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(128);
				match(T__0);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(129);
					expr();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			expr();
			setState(139);
			expr();
			setState(140);
			operator();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1016L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(ArithmeticParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(ArithmeticParser.INT, 0); }
		public TerminalNode NEGATIVE_INT() { return getToken(ArithmeticParser.NEGATIVE_INT, 0); }
		public TerminalNode ZERO() { return getToken(ArithmeticParser.ZERO, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ArithmeticParser.INT, 0); }
		public TerminalNode ZERO() { return getToken(ArithmeticParser.ZERO, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==ZERO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NonzeroContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ArithmeticParser.INT, 0); }
		public TerminalNode NEGATIVE_INT() { return getToken(ArithmeticParser.NEGATIVE_INT, 0); }
		public NonzeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonzero; }
	}

	public final NonzeroContext nonzero() throws RecognitionException {
		NonzeroContext _localctx = new NonzeroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nonzero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==NEGATIVE_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0011\u0097\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u0083\b\u0001\n\u0001\f\u0001\u0086\t\u0001\u0001\u0001\u0003\u0001"+
		"\u0089\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004\u0006\b\n"+
		"\f\u0000\u0004\u0001\u0000\u0003\t\u0001\u0000\n\r\u0002\u0000\n\n\f\f"+
		"\u0001\u0000\n\u000b\u00a4\u0000\u0013\u0001\u0000\u0000\u0000\u0002\u0088"+
		"\u0001\u0000\u0000\u0000\u0004\u008a\u0001\u0000\u0000\u0000\u0006\u008e"+
		"\u0001\u0000\u0000\u0000\b\u0090\u0001\u0000\u0000\u0000\n\u0092\u0001"+
		"\u0000\u0000\u0000\f\u0094\u0001\u0000\u0000\u0000\u000e\u000f\u0003\u0002"+
		"\u0001\u0000\u000f\u0010\u0005\u0010\u0000\u0000\u0010\u0012\u0001\u0000"+
		"\u0000\u0000\u0011\u000e\u0001\u0000\u0000\u0000\u0012\u0015\u0001\u0000"+
		"\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000"+
		"\u0000\u0000\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0005\u0001\u0000\u0000\u0017\u0018\u0003\u0004"+
		"\u0002\u0000\u0018\u0019\u0005\u0002\u0000\u0000\u0019\u0089\u0001\u0000"+
		"\u0000\u0000\u001a\u001b\u0005\u0001\u0000\u0000\u001b\u001c\u0003\b\u0004"+
		"\u0000\u001c\u001d\u0003\b\u0004\u0000\u001d\u001e\u0005\u0003\u0000\u0000"+
		"\u001e\u001f\u0005\u0002\u0000\u0000\u001f\u0089\u0001\u0000\u0000\u0000"+
		" !\u0005\u0001\u0000\u0000!\"\u0003\b\u0004\u0000\"#\u0003\b\u0004\u0000"+
		"#$\u0005\u0004\u0000\u0000$%\u0005\u0002\u0000\u0000%\u0089\u0001\u0000"+
		"\u0000\u0000&\'\u0005\u0001\u0000\u0000\'(\u0003\b\u0004\u0000()\u0003"+
		"\b\u0004\u0000)*\u0005\u0005\u0000\u0000*+\u0005\u0002\u0000\u0000+\u0089"+
		"\u0001\u0000\u0000\u0000,-\u0005\u0001\u0000\u0000-.\u0003\b\u0004\u0000"+
		"./\u0003\b\u0004\u0000/0\u0005\u0006\u0000\u000001\u0005\u0002\u0000\u0000"+
		"1\u0089\u0001\u0000\u0000\u000023\u0005\u0001\u0000\u000034\u0003\n\u0005"+
		"\u000045\u0003\f\u0006\u000056\u0005\u0007\u0000\u000067\u0005\u0002\u0000"+
		"\u00007\u0089\u0001\u0000\u0000\u000089\u0005\u0001\u0000\u00009:\u0003"+
		"\f\u0006\u0000:;\u0003\f\u0006\u0000;<\u0005\u0007\u0000\u0000<=\u0005"+
		"\u0002\u0000\u0000=\u0089\u0001\u0000\u0000\u0000>?\u0005\u0001\u0000"+
		"\u0000?@\u0003\n\u0005\u0000@A\u0003\n\u0005\u0000AB\u0005\b\u0000\u0000"+
		"BC\u0005\u0002\u0000\u0000C\u0089\u0001\u0000\u0000\u0000DE\u0005\u0001"+
		"\u0000\u0000EF\u0003\f\u0006\u0000FG\u0003\f\u0006\u0000GH\u0005\b\u0000"+
		"\u0000HI\u0005\u0002\u0000\u0000I\u0089\u0001\u0000\u0000\u0000JK\u0005"+
		"\u0001\u0000\u0000KL\u0003\b\u0004\u0000LM\u0003\n\u0005\u0000MN\u0005"+
		"\t\u0000\u0000NO\u0005\u0002\u0000\u0000O\u0089\u0001\u0000\u0000\u0000"+
		"PQ\u0005\u0001\u0000\u0000QR\u0003\b\u0004\u0000RS\u0005\u000e\u0000\u0000"+
		"ST\u0005\u0002\u0000\u0000T\u0089\u0001\u0000\u0000\u0000UV\u0005\u0001"+
		"\u0000\u0000VW\u0003\b\u0004\u0000WX\u0005\u000e\u0000\u0000XY\u0003\u0002"+
		"\u0001\u0000YZ\u0003\u0006\u0003\u0000Z[\u0005\u0002\u0000\u0000[\u0089"+
		"\u0001\u0000\u0000\u0000\\]\u0005\u0001\u0000\u0000]^\u0005\u000e\u0000"+
		"\u0000^\u0089\u0005\u0002\u0000\u0000_`\u0005\u0001\u0000\u0000`a\u0003"+
		"\u0002\u0001\u0000ab\u0005\u000e\u0000\u0000bc\u0005\u0002\u0000\u0000"+
		"c\u0089\u0001\u0000\u0000\u0000de\u0005\u0001\u0000\u0000ef\u0005\u000e"+
		"\u0000\u0000fg\u0003\u0002\u0001\u0000gh\u0005\u0002\u0000\u0000h\u0089"+
		"\u0001\u0000\u0000\u0000ij\u0005\u0001\u0000\u0000jk\u0005\u000e\u0000"+
		"\u0000kl\u0003\u0002\u0001\u0000lm\u0003\u0006\u0003\u0000mn\u0005\u0002"+
		"\u0000\u0000n\u0089\u0001\u0000\u0000\u0000op\u0005\u0001\u0000\u0000"+
		"pq\u0003\n\u0005\u0000qr\u0005\u000f\u0000\u0000rs\u0005\u0002\u0000\u0000"+
		"s\u0089\u0001\u0000\u0000\u0000tu\u0005\u0001\u0000\u0000uv\u0003\n\u0005"+
		"\u0000vw\u0005\u000f\u0000\u0000wx\u0003\u0002\u0001\u0000xy\u0005\u0002"+
		"\u0000\u0000y\u0089\u0001\u0000\u0000\u0000z{\u0005\u0001\u0000\u0000"+
		"{|\u0003\b\u0004\u0000|}\u0003\u0002\u0001\u0000}~\u0003\u0006\u0003\u0000"+
		"~\u007f\u0005\u0002\u0000\u0000\u007f\u0089\u0001\u0000\u0000\u0000\u0080"+
		"\u0084\u0005\u0001\u0000\u0000\u0081\u0083\u0003\u0002\u0001\u0000\u0082"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085"+
		"\u0087\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087"+
		"\u0089\u0005\u0002\u0000\u0000\u0088\u0016\u0001\u0000\u0000\u0000\u0088"+
		"\u001a\u0001\u0000\u0000\u0000\u0088 \u0001\u0000\u0000\u0000\u0088&\u0001"+
		"\u0000\u0000\u0000\u0088,\u0001\u0000\u0000\u0000\u00882\u0001\u0000\u0000"+
		"\u0000\u00888\u0001\u0000\u0000\u0000\u0088>\u0001\u0000\u0000\u0000\u0088"+
		"D\u0001\u0000\u0000\u0000\u0088J\u0001\u0000\u0000\u0000\u0088P\u0001"+
		"\u0000\u0000\u0000\u0088U\u0001\u0000\u0000\u0000\u0088\\\u0001\u0000"+
		"\u0000\u0000\u0088_\u0001\u0000\u0000\u0000\u0088d\u0001\u0000\u0000\u0000"+
		"\u0088i\u0001\u0000\u0000\u0000\u0088o\u0001\u0000\u0000\u0000\u0088t"+
		"\u0001\u0000\u0000\u0000\u0088z\u0001\u0000\u0000\u0000\u0088\u0080\u0001"+
		"\u0000\u0000\u0000\u0089\u0003\u0001\u0000\u0000\u0000\u008a\u008b\u0003"+
		"\u0002\u0001\u0000\u008b\u008c\u0003\u0002\u0001\u0000\u008c\u008d\u0003"+
		"\u0006\u0003\u0000\u008d\u0005\u0001\u0000\u0000\u0000\u008e\u008f\u0007"+
		"\u0000\u0000\u0000\u008f\u0007\u0001\u0000\u0000\u0000\u0090\u0091\u0007"+
		"\u0001\u0000\u0000\u0091\t\u0001\u0000\u0000\u0000\u0092\u0093\u0007\u0002"+
		"\u0000\u0000\u0093\u000b\u0001\u0000\u0000\u0000\u0094\u0095\u0007\u0003"+
		"\u0000\u0000\u0095\r\u0001\u0000\u0000\u0000\u0003\u0013\u0084\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}