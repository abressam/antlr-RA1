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
		INT=10, NEGATIVE_INT=11, ZERO=12, FLOAT=13, NEGATIVE_FLOAT=14, MEM=15, 
		RES=16, NEWLINE=17, WS=18;
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_operation = 2, RULE_operator = 3, RULE_number = 4, 
		RULE_rational = 5, RULE_nonZeroFloat = 6, RULE_integer = 7, RULE_nonZeroInt = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expr", "operation", "operator", "number", "rational", "nonZeroFloat", 
			"integer", "nonZeroInt"
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
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(18);
				expr();
				setState(19);
				match(NEWLINE);
				}
				}
				setState(25);
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
		public List<NonZeroIntContext> nonZeroInt() {
			return getRuleContexts(NonZeroIntContext.class);
		}
		public NonZeroIntContext nonZeroInt(int i) {
			return getRuleContext(NonZeroIntContext.class,i);
		}
		public RationalContext rational() {
			return getRuleContext(RationalContext.class,0);
		}
		public NonZeroFloatContext nonZeroFloat() {
			return getRuleContext(NonZeroFloatContext.class,0);
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(T__0);
				setState(27);
				operation();
				setState(28);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(T__0);
				setState(31);
				number();
				setState(32);
				number();
				setState(33);
				match(T__2);
				setState(34);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				match(T__0);
				setState(37);
				number();
				setState(38);
				number();
				setState(39);
				match(T__3);
				setState(40);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				match(T__0);
				setState(43);
				number();
				setState(44);
				number();
				setState(45);
				match(T__4);
				setState(46);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				match(T__0);
				setState(49);
				integer();
				setState(50);
				nonZeroInt();
				setState(51);
				match(T__5);
				setState(52);
				match(T__1);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				match(T__0);
				setState(55);
				rational();
				setState(56);
				nonZeroFloat();
				setState(57);
				match(T__5);
				setState(58);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				match(T__0);
				setState(61);
				rational();
				setState(62);
				nonZeroInt();
				setState(63);
				match(T__5);
				setState(64);
				match(T__1);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(66);
				match(T__0);
				setState(67);
				integer();
				setState(68);
				nonZeroFloat();
				setState(69);
				match(T__5);
				setState(70);
				match(T__1);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(72);
				match(T__0);
				setState(73);
				integer();
				setState(74);
				nonZeroInt();
				setState(75);
				match(T__6);
				setState(76);
				match(T__1);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(78);
				match(T__0);
				setState(79);
				nonZeroInt();
				setState(80);
				nonZeroInt();
				setState(81);
				match(T__6);
				setState(82);
				match(T__1);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(84);
				match(T__0);
				setState(85);
				integer();
				setState(86);
				integer();
				setState(87);
				match(T__7);
				setState(88);
				match(T__1);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(90);
				match(T__0);
				setState(91);
				nonZeroInt();
				setState(92);
				nonZeroInt();
				setState(93);
				match(T__7);
				setState(94);
				match(T__1);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(96);
				match(T__0);
				setState(97);
				number();
				setState(98);
				integer();
				setState(99);
				match(T__8);
				setState(100);
				match(T__1);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(102);
				match(T__0);
				setState(103);
				number();
				setState(104);
				match(MEM);
				setState(105);
				match(T__1);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(107);
				match(T__0);
				setState(108);
				number();
				setState(109);
				match(MEM);
				setState(110);
				expr();
				setState(111);
				operator();
				setState(112);
				match(T__1);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(114);
				match(T__0);
				setState(115);
				match(MEM);
				setState(116);
				match(T__1);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(117);
				match(T__0);
				setState(118);
				expr();
				setState(119);
				match(MEM);
				setState(120);
				match(T__1);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(122);
				match(T__0);
				setState(123);
				match(MEM);
				setState(124);
				expr();
				setState(125);
				match(T__1);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(127);
				match(T__0);
				setState(128);
				match(MEM);
				setState(129);
				expr();
				setState(130);
				operator();
				setState(131);
				match(T__1);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(133);
				match(T__0);
				setState(134);
				integer();
				setState(135);
				match(RES);
				setState(136);
				match(T__1);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(138);
				match(T__0);
				setState(139);
				integer();
				setState(140);
				match(RES);
				setState(141);
				expr();
				setState(142);
				match(T__1);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(144);
				match(T__0);
				setState(145);
				expr();
				setState(146);
				match(RES);
				setState(147);
				match(T__1);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(149);
				match(T__0);
				setState(150);
				expr();
				setState(151);
				match(RES);
				setState(152);
				expr();
				setState(153);
				match(T__1);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(155);
				match(T__0);
				setState(156);
				number();
				setState(157);
				expr();
				setState(158);
				operator();
				setState(159);
				match(T__1);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(161);
				match(T__0);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(162);
					expr();
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
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
			setState(171);
			expr();
			setState(172);
			expr();
			setState(173);
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
			setState(175);
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
		public TerminalNode NEGATIVE_FLOAT() { return getToken(ArithmeticParser.NEGATIVE_FLOAT, 0); }
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
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31744L) != 0)) ) {
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
	public static class RationalContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(ArithmeticParser.FLOAT, 0); }
		public TerminalNode ZERO() { return getToken(ArithmeticParser.ZERO, 0); }
		public RationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rational; }
	}

	public final RationalContext rational() throws RecognitionException {
		RationalContext _localctx = new RationalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rational);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !(_la==ZERO || _la==FLOAT) ) {
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
	public static class NonZeroFloatContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(ArithmeticParser.FLOAT, 0); }
		public TerminalNode NEGATIVE_FLOAT() { return getToken(ArithmeticParser.NEGATIVE_FLOAT, 0); }
		public NonZeroFloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonZeroFloat; }
	}

	public final NonZeroFloatContext nonZeroFloat() throws RecognitionException {
		NonZeroFloatContext _localctx = new NonZeroFloatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nonZeroFloat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !(_la==FLOAT || _la==NEGATIVE_FLOAT) ) {
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
		enterRule(_localctx, 14, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
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
	public static class NonZeroIntContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ArithmeticParser.INT, 0); }
		public TerminalNode NEGATIVE_INT() { return getToken(ArithmeticParser.NEGATIVE_INT, 0); }
		public NonZeroIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonZeroInt; }
	}

	public final NonZeroIntContext nonZeroInt() throws RecognitionException {
		NonZeroIntContext _localctx = new NonZeroIntContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nonZeroInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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
		"\u0004\u0001\u0012\u00bc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0016"+
		"\b\u0000\n\u0000\f\u0000\u0019\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
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
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u00a4\b\u0001\n\u0001\f\u0001\u00a7"+
		"\t\u0001\u0001\u0001\u0003\u0001\u00aa\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0000\u0006\u0001\u0000\u0003\t\u0001\u0000\n\u000e\u0001\u0000"+
		"\f\r\u0001\u0000\r\u000e\u0002\u0000\n\n\f\f\u0001\u0000\n\u000b\u00cc"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0002\u00a9\u0001\u0000\u0000\u0000"+
		"\u0004\u00ab\u0001\u0000\u0000\u0000\u0006\u00af\u0001\u0000\u0000\u0000"+
		"\b\u00b1\u0001\u0000\u0000\u0000\n\u00b3\u0001\u0000\u0000\u0000\f\u00b5"+
		"\u0001\u0000\u0000\u0000\u000e\u00b7\u0001\u0000\u0000\u0000\u0010\u00b9"+
		"\u0001\u0000\u0000\u0000\u0012\u0013\u0003\u0002\u0001\u0000\u0013\u0014"+
		"\u0005\u0011\u0000\u0000\u0014\u0016\u0001\u0000\u0000\u0000\u0015\u0012"+
		"\u0001\u0000\u0000\u0000\u0016\u0019\u0001\u0000\u0000\u0000\u0017\u0015"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0001"+
		"\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0005\u0001\u0000\u0000\u001b\u001c\u0003\u0004\u0002\u0000\u001c\u001d"+
		"\u0005\u0002\u0000\u0000\u001d\u00aa\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0005\u0001\u0000\u0000\u001f \u0003\b\u0004\u0000 !\u0003\b\u0004\u0000"+
		"!\"\u0005\u0003\u0000\u0000\"#\u0005\u0002\u0000\u0000#\u00aa\u0001\u0000"+
		"\u0000\u0000$%\u0005\u0001\u0000\u0000%&\u0003\b\u0004\u0000&\'\u0003"+
		"\b\u0004\u0000\'(\u0005\u0004\u0000\u0000()\u0005\u0002\u0000\u0000)\u00aa"+
		"\u0001\u0000\u0000\u0000*+\u0005\u0001\u0000\u0000+,\u0003\b\u0004\u0000"+
		",-\u0003\b\u0004\u0000-.\u0005\u0005\u0000\u0000./\u0005\u0002\u0000\u0000"+
		"/\u00aa\u0001\u0000\u0000\u000001\u0005\u0001\u0000\u000012\u0003\u000e"+
		"\u0007\u000023\u0003\u0010\b\u000034\u0005\u0006\u0000\u000045\u0005\u0002"+
		"\u0000\u00005\u00aa\u0001\u0000\u0000\u000067\u0005\u0001\u0000\u0000"+
		"78\u0003\n\u0005\u000089\u0003\f\u0006\u00009:\u0005\u0006\u0000\u0000"+
		":;\u0005\u0002\u0000\u0000;\u00aa\u0001\u0000\u0000\u0000<=\u0005\u0001"+
		"\u0000\u0000=>\u0003\n\u0005\u0000>?\u0003\u0010\b\u0000?@\u0005\u0006"+
		"\u0000\u0000@A\u0005\u0002\u0000\u0000A\u00aa\u0001\u0000\u0000\u0000"+
		"BC\u0005\u0001\u0000\u0000CD\u0003\u000e\u0007\u0000DE\u0003\f\u0006\u0000"+
		"EF\u0005\u0006\u0000\u0000FG\u0005\u0002\u0000\u0000G\u00aa\u0001\u0000"+
		"\u0000\u0000HI\u0005\u0001\u0000\u0000IJ\u0003\u000e\u0007\u0000JK\u0003"+
		"\u0010\b\u0000KL\u0005\u0007\u0000\u0000LM\u0005\u0002\u0000\u0000M\u00aa"+
		"\u0001\u0000\u0000\u0000NO\u0005\u0001\u0000\u0000OP\u0003\u0010\b\u0000"+
		"PQ\u0003\u0010\b\u0000QR\u0005\u0007\u0000\u0000RS\u0005\u0002\u0000\u0000"+
		"S\u00aa\u0001\u0000\u0000\u0000TU\u0005\u0001\u0000\u0000UV\u0003\u000e"+
		"\u0007\u0000VW\u0003\u000e\u0007\u0000WX\u0005\b\u0000\u0000XY\u0005\u0002"+
		"\u0000\u0000Y\u00aa\u0001\u0000\u0000\u0000Z[\u0005\u0001\u0000\u0000"+
		"[\\\u0003\u0010\b\u0000\\]\u0003\u0010\b\u0000]^\u0005\b\u0000\u0000^"+
		"_\u0005\u0002\u0000\u0000_\u00aa\u0001\u0000\u0000\u0000`a\u0005\u0001"+
		"\u0000\u0000ab\u0003\b\u0004\u0000bc\u0003\u000e\u0007\u0000cd\u0005\t"+
		"\u0000\u0000de\u0005\u0002\u0000\u0000e\u00aa\u0001\u0000\u0000\u0000"+
		"fg\u0005\u0001\u0000\u0000gh\u0003\b\u0004\u0000hi\u0005\u000f\u0000\u0000"+
		"ij\u0005\u0002\u0000\u0000j\u00aa\u0001\u0000\u0000\u0000kl\u0005\u0001"+
		"\u0000\u0000lm\u0003\b\u0004\u0000mn\u0005\u000f\u0000\u0000no\u0003\u0002"+
		"\u0001\u0000op\u0003\u0006\u0003\u0000pq\u0005\u0002\u0000\u0000q\u00aa"+
		"\u0001\u0000\u0000\u0000rs\u0005\u0001\u0000\u0000st\u0005\u000f\u0000"+
		"\u0000t\u00aa\u0005\u0002\u0000\u0000uv\u0005\u0001\u0000\u0000vw\u0003"+
		"\u0002\u0001\u0000wx\u0005\u000f\u0000\u0000xy\u0005\u0002\u0000\u0000"+
		"y\u00aa\u0001\u0000\u0000\u0000z{\u0005\u0001\u0000\u0000{|\u0005\u000f"+
		"\u0000\u0000|}\u0003\u0002\u0001\u0000}~\u0005\u0002\u0000\u0000~\u00aa"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0001\u0000\u0000\u0080\u0081"+
		"\u0005\u000f\u0000\u0000\u0081\u0082\u0003\u0002\u0001\u0000\u0082\u0083"+
		"\u0003\u0006\u0003\u0000\u0083\u0084\u0005\u0002\u0000\u0000\u0084\u00aa"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0001\u0000\u0000\u0086\u0087"+
		"\u0003\u000e\u0007\u0000\u0087\u0088\u0005\u0010\u0000\u0000\u0088\u0089"+
		"\u0005\u0002\u0000\u0000\u0089\u00aa\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0005\u0001\u0000\u0000\u008b\u008c\u0003\u000e\u0007\u0000\u008c\u008d"+
		"\u0005\u0010\u0000\u0000\u008d\u008e\u0003\u0002\u0001\u0000\u008e\u008f"+
		"\u0005\u0002\u0000\u0000\u008f\u00aa\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005\u0001\u0000\u0000\u0091\u0092\u0003\u0002\u0001\u0000\u0092\u0093"+
		"\u0005\u0010\u0000\u0000\u0093\u0094\u0005\u0002\u0000\u0000\u0094\u00aa"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0001\u0000\u0000\u0096\u0097"+
		"\u0003\u0002\u0001\u0000\u0097\u0098\u0005\u0010\u0000\u0000\u0098\u0099"+
		"\u0003\u0002\u0001\u0000\u0099\u009a\u0005\u0002\u0000\u0000\u009a\u00aa"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0001\u0000\u0000\u009c\u009d"+
		"\u0003\b\u0004\u0000\u009d\u009e\u0003\u0002\u0001\u0000\u009e\u009f\u0003"+
		"\u0006\u0003\u0000\u009f\u00a0\u0005\u0002\u0000\u0000\u00a0\u00aa\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a5\u0005\u0001\u0000\u0000\u00a2\u00a4\u0003"+
		"\u0002\u0001\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a8\u00aa\u0005\u0002\u0000\u0000\u00a9\u001a\u0001"+
		"\u0000\u0000\u0000\u00a9\u001e\u0001\u0000\u0000\u0000\u00a9$\u0001\u0000"+
		"\u0000\u0000\u00a9*\u0001\u0000\u0000\u0000\u00a90\u0001\u0000\u0000\u0000"+
		"\u00a96\u0001\u0000\u0000\u0000\u00a9<\u0001\u0000\u0000\u0000\u00a9B"+
		"\u0001\u0000\u0000\u0000\u00a9H\u0001\u0000\u0000\u0000\u00a9N\u0001\u0000"+
		"\u0000\u0000\u00a9T\u0001\u0000\u0000\u0000\u00a9Z\u0001\u0000\u0000\u0000"+
		"\u00a9`\u0001\u0000\u0000\u0000\u00a9f\u0001\u0000\u0000\u0000\u00a9k"+
		"\u0001\u0000\u0000\u0000\u00a9r\u0001\u0000\u0000\u0000\u00a9u\u0001\u0000"+
		"\u0000\u0000\u00a9z\u0001\u0000\u0000\u0000\u00a9\u007f\u0001\u0000\u0000"+
		"\u0000\u00a9\u0085\u0001\u0000\u0000\u0000\u00a9\u008a\u0001\u0000\u0000"+
		"\u0000\u00a9\u0090\u0001\u0000\u0000\u0000\u00a9\u0095\u0001\u0000\u0000"+
		"\u0000\u00a9\u009b\u0001\u0000\u0000\u0000\u00a9\u00a1\u0001\u0000\u0000"+
		"\u0000\u00aa\u0003\u0001\u0000\u0000\u0000\u00ab\u00ac\u0003\u0002\u0001"+
		"\u0000\u00ac\u00ad\u0003\u0002\u0001\u0000\u00ad\u00ae\u0003\u0006\u0003"+
		"\u0000\u00ae\u0005\u0001\u0000\u0000\u0000\u00af\u00b0\u0007\u0000\u0000"+
		"\u0000\u00b0\u0007\u0001\u0000\u0000\u0000\u00b1\u00b2\u0007\u0001\u0000"+
		"\u0000\u00b2\t\u0001\u0000\u0000\u0000\u00b3\u00b4\u0007\u0002\u0000\u0000"+
		"\u00b4\u000b\u0001\u0000\u0000\u0000\u00b5\u00b6\u0007\u0003\u0000\u0000"+
		"\u00b6\r\u0001\u0000\u0000\u0000\u00b7\u00b8\u0007\u0004\u0000\u0000\u00b8"+
		"\u000f\u0001\u0000\u0000\u0000\u00b9\u00ba\u0007\u0005\u0000\u0000\u00ba"+
		"\u0011\u0001\u0000\u0000\u0000\u0003\u0017\u00a5\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}