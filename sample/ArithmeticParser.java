// Generated from Arithmetic.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArithmeticParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitProg(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitExpr(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitOperation(this);
		}
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

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitOperator(this);
		}
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(ArithmeticParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(ArithmeticParser.INT, 0); }
		public TerminalNode NEGATIVE_INT() { return getToken(ArithmeticParser.NEGATIVE_INT, 0); }
		public TerminalNode ZERO() { return getToken(ArithmeticParser.ZERO, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitNumber(this);
		}
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << NEGATIVE_INT) | (1L << ZERO) | (1L << FLOAT))) != 0)) ) {
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ArithmeticParser.INT, 0); }
		public TerminalNode ZERO() { return getToken(ArithmeticParser.ZERO, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitInteger(this);
		}
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

	public static class NonzeroContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ArithmeticParser.INT, 0); }
		public TerminalNode NEGATIVE_INT() { return getToken(ArithmeticParser.NEGATIVE_INT, 0); }
		public NonzeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonzero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterNonzero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitNonzero(this);
		}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u0099\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\7\2\24\n"+
		"\2\f\2\16\2\27\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0085\n\3\f\3\16\3\u0088\13\3\3\3"+
		"\5\3\u008b\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\2\2"+
		"\t\2\4\6\b\n\f\16\2\6\3\2\5\13\3\2\f\17\4\2\f\f\16\16\3\2\f\r\2\u00a6"+
		"\2\25\3\2\2\2\4\u008a\3\2\2\2\6\u008c\3\2\2\2\b\u0090\3\2\2\2\n\u0092"+
		"\3\2\2\2\f\u0094\3\2\2\2\16\u0096\3\2\2\2\20\21\5\4\3\2\21\22\7\22\2\2"+
		"\22\24\3\2\2\2\23\20\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2"+
		"\26\3\3\2\2\2\27\25\3\2\2\2\30\31\7\3\2\2\31\32\5\6\4\2\32\33\7\4\2\2"+
		"\33\u008b\3\2\2\2\34\35\7\3\2\2\35\36\5\n\6\2\36\37\5\n\6\2\37 \7\5\2"+
		"\2 !\7\4\2\2!\u008b\3\2\2\2\"#\7\3\2\2#$\5\n\6\2$%\5\n\6\2%&\7\6\2\2&"+
		"\'\7\4\2\2\'\u008b\3\2\2\2()\7\3\2\2)*\5\n\6\2*+\5\n\6\2+,\7\7\2\2,-\7"+
		"\4\2\2-\u008b\3\2\2\2./\7\3\2\2/\60\5\n\6\2\60\61\5\n\6\2\61\62\7\b\2"+
		"\2\62\63\7\4\2\2\63\u008b\3\2\2\2\64\65\7\3\2\2\65\66\5\f\7\2\66\67\5"+
		"\16\b\2\678\7\t\2\289\7\4\2\29\u008b\3\2\2\2:;\7\3\2\2;<\5\16\b\2<=\5"+
		"\16\b\2=>\7\t\2\2>?\7\4\2\2?\u008b\3\2\2\2@A\7\3\2\2AB\5\f\7\2BC\5\f\7"+
		"\2CD\7\n\2\2DE\7\4\2\2E\u008b\3\2\2\2FG\7\3\2\2GH\5\16\b\2HI\5\16\b\2"+
		"IJ\7\n\2\2JK\7\4\2\2K\u008b\3\2\2\2LM\7\3\2\2MN\5\n\6\2NO\5\f\7\2OP\7"+
		"\13\2\2PQ\7\4\2\2Q\u008b\3\2\2\2RS\7\3\2\2ST\5\n\6\2TU\7\20\2\2UV\7\4"+
		"\2\2V\u008b\3\2\2\2WX\7\3\2\2XY\5\n\6\2YZ\7\20\2\2Z[\5\4\3\2[\\\5\b\5"+
		"\2\\]\7\4\2\2]\u008b\3\2\2\2^_\7\3\2\2_`\7\20\2\2`\u008b\7\4\2\2ab\7\3"+
		"\2\2bc\5\4\3\2cd\7\20\2\2de\7\4\2\2e\u008b\3\2\2\2fg\7\3\2\2gh\7\20\2"+
		"\2hi\5\4\3\2ij\7\4\2\2j\u008b\3\2\2\2kl\7\3\2\2lm\7\20\2\2mn\5\4\3\2n"+
		"o\5\b\5\2op\7\4\2\2p\u008b\3\2\2\2qr\7\3\2\2rs\5\f\7\2st\7\21\2\2tu\7"+
		"\4\2\2u\u008b\3\2\2\2vw\7\3\2\2wx\5\f\7\2xy\7\21\2\2yz\5\4\3\2z{\7\4\2"+
		"\2{\u008b\3\2\2\2|}\7\3\2\2}~\5\n\6\2~\177\5\4\3\2\177\u0080\5\b\5\2\u0080"+
		"\u0081\7\4\2\2\u0081\u008b\3\2\2\2\u0082\u0086\7\3\2\2\u0083\u0085\5\4"+
		"\3\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\7\4"+
		"\2\2\u008a\30\3\2\2\2\u008a\34\3\2\2\2\u008a\"\3\2\2\2\u008a(\3\2\2\2"+
		"\u008a.\3\2\2\2\u008a\64\3\2\2\2\u008a:\3\2\2\2\u008a@\3\2\2\2\u008aF"+
		"\3\2\2\2\u008aL\3\2\2\2\u008aR\3\2\2\2\u008aW\3\2\2\2\u008a^\3\2\2\2\u008a"+
		"a\3\2\2\2\u008af\3\2\2\2\u008ak\3\2\2\2\u008aq\3\2\2\2\u008av\3\2\2\2"+
		"\u008a|\3\2\2\2\u008a\u0082\3\2\2\2\u008b\5\3\2\2\2\u008c\u008d\5\4\3"+
		"\2\u008d\u008e\5\4\3\2\u008e\u008f\5\b\5\2\u008f\7\3\2\2\2\u0090\u0091"+
		"\t\2\2\2\u0091\t\3\2\2\2\u0092\u0093\t\3\2\2\u0093\13\3\2\2\2\u0094\u0095"+
		"\t\4\2\2\u0095\r\3\2\2\2\u0096\u0097\t\5\2\2\u0097\17\3\2\2\2\5\25\u0086"+
		"\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}