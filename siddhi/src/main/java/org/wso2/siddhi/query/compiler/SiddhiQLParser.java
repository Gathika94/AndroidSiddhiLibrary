// Generated from /home/chamath/Projects/AndroidSiddhi/siddhi/src/main/antlr4/org/wso2/siddhi/query/compiler/SiddhiQL.g4 by ANTLR 4.2.2
package org.wso2.siddhi.query.compiler;

	//import org.wso2.siddhi.query.compiler.exception.SiddhiParserException;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SiddhiQLParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_LITERAL=1, LONG_LITERAL=2, FLOAT_LITERAL=3, DOUBLE_LITERAL=4, COL=5, 
		SCOL=6, DOT=7, TRIPLE_DOT=8, OPEN_PAR=9, CLOSE_PAR=10, OPEN_SQARE_BRACKETS=11, 
		CLOASE_SQARE_BRACKETS=12, COMMA=13, ASSIGN=14, STAR=15, PLUS=16, QUESTION=17, 
		MINUS=18, DIV=19, MOD=20, LT=21, LT_EQ=22, GT=23, GT_EQ=24, EQ=25, NOT_EQ=26, 
		AT_SYMBOL=27, FOLLOWED_BY=28, HASH=29, STREAM=30, DEFINE=31, FUNCTION=32, 
		TRIGGER=33, TABLE=34, APP=35, FROM=36, PARTITION=37, WINDOW=38, SELECT=39, 
		GROUP=40, BY=41, HAVING=42, INSERT=43, DELETE=44, UPDATE=45, RETURN=46, 
		EVENTS=47, INTO=48, OUTPUT=49, EXPIRED=50, CURRENT=51, SNAPSHOT=52, FOR=53, 
		RAW=54, OF=55, AS=56, AT=57, OR=58, AND=59, IN=60, ON=61, IS=62, NOT=63, 
		WITHIN=64, WITH=65, BEGIN=66, END=67, NULL=68, EVERY=69, LAST=70, ALL=71, 
		FIRST=72, JOIN=73, INNER=74, OUTER=75, RIGHT=76, LEFT=77, FULL=78, UNIDIRECTIONAL=79, 
		YEARS=80, MONTHS=81, WEEKS=82, DAYS=83, HOURS=84, MINUTES=85, SECONDS=86, 
		MILLISECONDS=87, FALSE=88, TRUE=89, STRING=90, INT=91, LONG=92, FLOAT=93, 
		DOUBLE=94, BOOL=95, OBJECT=96, AGGREGATION=97, AGGREGATE=98, PER=99, ID_QUOTES=100, 
		ID=101, STRING_LITERAL=102, SINGLE_LINE_COMMENT=103, MULTILINE_COMMENT=104, 
		SPACES=105, UNEXPECTED_CHAR=106, SCRIPT=107;
	public static final String[] tokenNames = {
		"<INVALID>", "INT_LITERAL", "LONG_LITERAL", "FLOAT_LITERAL", "DOUBLE_LITERAL", 
		"':'", "';'", "'.'", "'...'", "'('", "')'", "'['", "']'", "','", "'='", 
		"'*'", "'+'", "'?'", "'-'", "'/'", "'%'", "'<'", "'<='", "'>'", "'>='", 
		"'=='", "'!='", "'@'", "'->'", "'#'", "STREAM", "DEFINE", "FUNCTION", 
		"TRIGGER", "TABLE", "APP", "FROM", "PARTITION", "WINDOW", "SELECT", "GROUP", 
		"BY", "HAVING", "INSERT", "DELETE", "UPDATE", "RETURN", "EVENTS", "INTO", 
		"OUTPUT", "EXPIRED", "CURRENT", "SNAPSHOT", "FOR", "RAW", "OF", "AS", 
		"AT", "OR", "AND", "IN", "ON", "IS", "NOT", "WITHIN", "WITH", "BEGIN", 
		"END", "NULL", "EVERY", "LAST", "ALL", "FIRST", "JOIN", "INNER", "OUTER", 
		"RIGHT", "LEFT", "FULL", "UNIDIRECTIONAL", "YEARS", "MONTHS", "WEEKS", 
		"DAYS", "HOURS", "MINUTES", "SECONDS", "MILLISECONDS", "FALSE", "TRUE", 
		"STRING", "INT", "LONG", "FLOAT", "DOUBLE", "BOOL", "OBJECT", "AGGREGATION", 
		"AGGREGATE", "PER", "ID_QUOTES", "ID", "STRING_LITERAL", "SINGLE_LINE_COMMENT", 
		"MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR", "SCRIPT"
	};
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_siddhi_app = 2, RULE_execution_element = 3, 
		RULE_definition_stream_final = 4, RULE_definition_stream = 5, RULE_definition_table_final = 6, 
		RULE_definition_table = 7, RULE_definition_window_final = 8, RULE_definition_window = 9, 
		RULE_store_query_final = 10, RULE_store_query = 11, RULE_store_input = 12, 
		RULE_definition_function_final = 13, RULE_definition_function = 14, RULE_function_name = 15, 
		RULE_language_name = 16, RULE_function_body = 17, RULE_definition_trigger_final = 18, 
		RULE_definition_trigger = 19, RULE_trigger_name = 20, RULE_definition_aggregation_final = 21, 
		RULE_definition_aggregation = 22, RULE_aggregation_name = 23, RULE_aggregation_time = 24, 
		RULE_aggregation_time_duration = 25, RULE_aggregation_time_range = 26, 
		RULE_aggregation_time_interval = 27, RULE_annotation = 28, RULE_app_annotation = 29, 
		RULE_annotation_element = 30, RULE_partition = 31, RULE_partition_final = 32, 
		RULE_partition_with_stream = 33, RULE_condition_ranges = 34, RULE_condition_range = 35, 
		RULE_query_final = 36, RULE_query = 37, RULE_query_input = 38, RULE_standard_stream = 39, 
		RULE_join_stream = 40, RULE_join_source = 41, RULE_pattern_stream = 42, 
		RULE_every_pattern_source_chain = 43, RULE_pattern_source_chain = 44, 
		RULE_pattern_source = 45, RULE_logical_stateful_source = 46, RULE_pattern_collection_stateful_source = 47, 
		RULE_standard_stateful_source = 48, RULE_basic_source = 49, RULE_basic_source_stream_handlers = 50, 
		RULE_basic_source_stream_handler = 51, RULE_sequence_stream = 52, RULE_sequence_source_chain = 53, 
		RULE_sequence_source = 54, RULE_sequence_collection_stateful_source = 55, 
		RULE_anonymous_stream = 56, RULE_filter = 57, RULE_stream_function = 58, 
		RULE_window = 59, RULE_group_by_query_selection = 60, RULE_query_section = 61, 
		RULE_group_by = 62, RULE_having = 63, RULE_query_output = 64, RULE_output_event_type = 65, 
		RULE_output_rate = 66, RULE_output_rate_type = 67, RULE_within_time = 68, 
		RULE_within_time_range = 69, RULE_per = 70, RULE_output_attribute = 71, 
		RULE_attribute = 72, RULE_expression = 73, RULE_math_operation = 74, RULE_function_operation = 75, 
		RULE_attribute_list = 76, RULE_null_check = 77, RULE_stream_reference = 78, 
		RULE_attribute_reference = 79, RULE_attribute_index = 80, RULE_function_id = 81, 
		RULE_function_namespace = 82, RULE_stream_id = 83, RULE_source_id = 84, 
		RULE_alias = 85, RULE_property_name = 86, RULE_attribute_name = 87, RULE_type = 88, 
		RULE_property_value = 89, RULE_property_separator = 90, RULE_source = 91, 
		RULE_target = 92, RULE_event = 93, RULE_name = 94, RULE_collect = 95, 
		RULE_attribute_type = 96, RULE_join = 97, RULE_constant_value = 98, RULE_id = 99, 
		RULE_keyword = 100, RULE_time_value = 101, RULE_year_value = 102, RULE_month_value = 103, 
		RULE_week_value = 104, RULE_day_value = 105, RULE_hour_value = 106, RULE_minute_value = 107, 
		RULE_second_value = 108, RULE_millisecond_value = 109, RULE_signed_double_value = 110, 
		RULE_signed_long_value = 111, RULE_signed_float_value = 112, RULE_signed_int_value = 113, 
		RULE_bool_value = 114, RULE_string_value = 115;
	public static final String[] ruleNames = {
		"parse", "error", "siddhi_app", "execution_element", "definition_stream_final", 
		"definition_stream", "definition_table_final", "definition_table", "definition_window_final", 
		"definition_window", "store_query_final", "store_query", "store_input", 
		"definition_function_final", "definition_function", "function_name", "language_name", 
		"function_body", "definition_trigger_final", "definition_trigger", "trigger_name", 
		"definition_aggregation_final", "definition_aggregation", "aggregation_name", 
		"aggregation_time", "aggregation_time_duration", "aggregation_time_range", 
		"aggregation_time_interval", "annotation", "app_annotation", "annotation_element", 
		"partition", "partition_final", "partition_with_stream", "condition_ranges", 
		"condition_range", "query_final", "query", "query_input", "standard_stream", 
		"join_stream", "join_source", "pattern_stream", "every_pattern_source_chain", 
		"pattern_source_chain", "pattern_source", "logical_stateful_source", "pattern_collection_stateful_source", 
		"standard_stateful_source", "basic_source", "basic_source_stream_handlers", 
		"basic_source_stream_handler", "sequence_stream", "sequence_source_chain", 
		"sequence_source", "sequence_collection_stateful_source", "anonymous_stream", 
		"filter", "stream_function", "window", "group_by_query_selection", "query_section", 
		"group_by", "having", "query_output", "output_event_type", "output_rate", 
		"output_rate_type", "within_time", "within_time_range", "per", "output_attribute", 
		"attribute", "expression", "math_operation", "function_operation", "attribute_list", 
		"null_check", "stream_reference", "attribute_reference", "attribute_index", 
		"function_id", "function_namespace", "stream_id", "source_id", "alias", 
		"property_name", "attribute_name", "type", "property_value", "property_separator", 
		"source", "target", "event", "name", "collect", "attribute_type", "join", 
		"constant_value", "id", "keyword", "time_value", "year_value", "month_value", 
		"week_value", "day_value", "hour_value", "minute_value", "second_value", 
		"millisecond_value", "signed_double_value", "signed_long_value", "signed_float_value", 
		"signed_int_value", "bool_value", "string_value"
	};

	@Override
	public String getGrammarFileName() { return "SiddhiQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SiddhiQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SiddhiQLParser.EOF, 0); }
		public Siddhi_appContext siddhi_app() {
			return getRuleContext(Siddhi_appContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); siddhi_app();
			setState(233); match(EOF);
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

	public static class ErrorContext extends ParserRuleContext {
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SiddhiQLParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); match(UNEXPECTED_CHAR);
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

	public static class Siddhi_appContext extends ParserRuleContext {
		public Execution_elementContext execution_element(int i) {
			return getRuleContext(Execution_elementContext.class,i);
		}
		public Definition_aggregationContext definition_aggregation(int i) {
			return getRuleContext(Definition_aggregationContext.class,i);
		}
		public List<Definition_triggerContext> definition_trigger() {
			return getRuleContexts(Definition_triggerContext.class);
		}
		public List<Definition_streamContext> definition_stream() {
			return getRuleContexts(Definition_streamContext.class);
		}
		public App_annotationContext app_annotation(int i) {
			return getRuleContext(App_annotationContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public List<Definition_windowContext> definition_window() {
			return getRuleContexts(Definition_windowContext.class);
		}
		public List<Definition_aggregationContext> definition_aggregation() {
			return getRuleContexts(Definition_aggregationContext.class);
		}
		public List<App_annotationContext> app_annotation() {
			return getRuleContexts(App_annotationContext.class);
		}
		public Definition_tableContext definition_table(int i) {
			return getRuleContext(Definition_tableContext.class,i);
		}
		public Definition_functionContext definition_function(int i) {
			return getRuleContext(Definition_functionContext.class,i);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public Definition_streamContext definition_stream(int i) {
			return getRuleContext(Definition_streamContext.class,i);
		}
		public List<Definition_tableContext> definition_table() {
			return getRuleContexts(Definition_tableContext.class);
		}
		public List<Definition_functionContext> definition_function() {
			return getRuleContexts(Definition_functionContext.class);
		}
		public Definition_windowContext definition_window(int i) {
			return getRuleContext(Definition_windowContext.class,i);
		}
		public List<Execution_elementContext> execution_element() {
			return getRuleContexts(Execution_elementContext.class);
		}
		public Definition_triggerContext definition_trigger(int i) {
			return getRuleContext(Definition_triggerContext.class,i);
		}
		public Siddhi_appContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siddhi_app; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterSiddhi_app(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitSiddhi_app(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSiddhi_app(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Siddhi_appContext siddhi_app() throws RecognitionException {
		Siddhi_appContext _localctx = new Siddhi_appContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_siddhi_app);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(239);
					switch (_input.LA(1)) {
					case AT_SYMBOL:
						{
						setState(237); app_annotation();
						}
						break;
					case UNEXPECTED_CHAR:
						{
						setState(238); error();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(327);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(251);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(244); definition_stream();
					}
					break;

				case 2:
					{
					setState(245); definition_table();
					}
					break;

				case 3:
					{
					setState(246); definition_trigger();
					}
					break;

				case 4:
					{
					setState(247); definition_function();
					}
					break;

				case 5:
					{
					setState(248); definition_window();
					}
					break;

				case 6:
					{
					setState(249); definition_aggregation();
					}
					break;

				case 7:
					{
					setState(250); error();
					}
					break;
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(253); match(SCOL);
						setState(261);
						switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
						case 1:
							{
							setState(254); definition_stream();
							}
							break;

						case 2:
							{
							setState(255); definition_table();
							}
							break;

						case 3:
							{
							setState(256); definition_trigger();
							}
							break;

						case 4:
							{
							setState(257); definition_function();
							}
							break;

						case 5:
							{
							setState(258); definition_window();
							}
							break;

						case 6:
							{
							setState(259); definition_aggregation();
							}
							break;

						case 7:
							{
							setState(260); error();
							}
							break;
						}
						}
						} 
					}
					setState(267);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(269);
				_la = _input.LA(1);
				if (_la==SCOL) {
					{
					setState(268); match(SCOL);
					}
				}

				}
				break;

			case 2:
				{
				}
				break;

			case 3:
				{
				setState(274);
				switch (_input.LA(1)) {
				case AT_SYMBOL:
				case FROM:
				case PARTITION:
					{
					setState(272); execution_element();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(273); error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(276); match(SCOL);
						setState(279);
						switch (_input.LA(1)) {
						case AT_SYMBOL:
						case FROM:
						case PARTITION:
							{
							setState(277); execution_element();
							}
							break;
						case UNEXPECTED_CHAR:
							{
							setState(278); error();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(285);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(287);
				_la = _input.LA(1);
				if (_la==SCOL) {
					{
					setState(286); match(SCOL);
					}
				}

				}
				break;

			case 4:
				{
				}
				break;

			case 5:
				{
				setState(297);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(290); definition_stream();
					}
					break;

				case 2:
					{
					setState(291); definition_table();
					}
					break;

				case 3:
					{
					setState(292); definition_trigger();
					}
					break;

				case 4:
					{
					setState(293); definition_function();
					}
					break;

				case 5:
					{
					setState(294); definition_window();
					}
					break;

				case 6:
					{
					setState(295); definition_aggregation();
					}
					break;

				case 7:
					{
					setState(296); error();
					}
					break;
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(299); match(SCOL);
						setState(307);
						switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
						case 1:
							{
							setState(300); definition_stream();
							}
							break;

						case 2:
							{
							setState(301); definition_table();
							}
							break;

						case 3:
							{
							setState(302); definition_trigger();
							}
							break;

						case 4:
							{
							setState(303); definition_function();
							}
							break;

						case 5:
							{
							setState(304); definition_window();
							}
							break;

						case 6:
							{
							setState(305); definition_aggregation();
							}
							break;

						case 7:
							{
							setState(306); error();
							}
							break;
						}
						}
						} 
					}
					setState(313);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(314); match(SCOL);
						setState(317);
						switch (_input.LA(1)) {
						case AT_SYMBOL:
						case FROM:
						case PARTITION:
							{
							setState(315); execution_element();
							}
							break;
						case UNEXPECTED_CHAR:
							{
							setState(316); error();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(323);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(325);
				_la = _input.LA(1);
				if (_la==SCOL) {
					{
					setState(324); match(SCOL);
					}
				}

				}
				break;
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

	public static class Execution_elementContext extends ParserRuleContext {
		public PartitionContext partition() {
			return getRuleContext(PartitionContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public Execution_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execution_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterExecution_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitExecution_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitExecution_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Execution_elementContext execution_element() throws RecognitionException {
		Execution_elementContext _localctx = new Execution_elementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_execution_element);
		try {
			setState(331);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329); query();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330); partition();
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

	public static class Definition_stream_finalContext extends ParserRuleContext {
		public Definition_streamContext definition_stream() {
			return getRuleContext(Definition_streamContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SiddhiQLParser.EOF, 0); }
		public Definition_stream_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_stream_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterDefinition_stream_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitDefinition_stream_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_stream_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_stream_finalContext definition_stream_final() throws RecognitionException {
		Definition_stream_finalContext _localctx = new Definition_stream_finalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_definition_stream_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333); definition_stream();
			setState(335);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(334); match(SCOL);
				}
			}

			setState(337); match(EOF);
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

	public static class Definition_streamContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TerminalNode DEFINE() { return getToken(SiddhiQLParser.DEFINE, 0); }
		public Attribute_typeContext attribute_type(int i) {
			return getRuleContext(Attribute_typeContext.class,i);
		}
		public List<Attribute_typeContext> attribute_type() {
			return getRuleContexts(Attribute_typeContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode STREAM() { return getToken(SiddhiQLParser.STREAM, 0); }
		public Attribute_nameContext attribute_name(int i) {
			return getRuleContext(Attribute_nameContext.class,i);
		}
		public List<Attribute_nameContext> attribute_name() {
			return getRuleContexts(Attribute_nameContext.class);
		}
		public Definition_streamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_stream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterDefinition_stream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitDefinition_stream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_stream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_streamContext definition_stream() throws RecognitionException {
		Definition_streamContext _localctx = new Definition_streamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_definition_stream);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT_SYMBOL) {
				{
				{
				setState(339); annotation();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345); match(DEFINE);
			setState(346); match(STREAM);
			setState(347); source();
			setState(348); match(OPEN_PAR);
			setState(349); attribute_name();
			setState(350); attribute_type();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(351); match(COMMA);
				setState(352); attribute_name();
				setState(353); attribute_type();
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360); match(CLOSE_PAR);
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

	public static class Definition_table_finalContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SiddhiQLParser.EOF, 0); }
		public Definition_tableContext definition_table() {
			return getRuleContext(Definition_tableContext.class,0);
		}
		public Definition_table_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_table_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterDefinition_table_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitDefinition_table_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_table_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_table_finalContext definition_table_final() throws RecognitionException {
		Definition_table_finalContext _localctx = new Definition_table_finalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_definition_table_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362); definition_table();
			setState(364);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(363); match(SCOL);
				}
			}

			setState(366); match(EOF);
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

	public static class Definition_tableContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TerminalNode DEFINE() { return getToken(SiddhiQLParser.DEFINE, 0); }
		public Attribute_typeContext attribute_type(int i) {
			return getRuleContext(Attribute_typeContext.class,i);
		}
		public List<Attribute_typeContext> attribute_type() {
			return getRuleContexts(Attribute_typeContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Attribute_nameContext attribute_name(int i) {
			return getRuleContext(Attribute_nameContext.class,i);
		}
		public List<Attribute_nameContext> attribute_name() {
			return getRuleContexts(Attribute_nameContext.class);
		}
		public TerminalNode TABLE() { return getToken(SiddhiQLParser.TABLE, 0); }
		public Definition_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterDefinition_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitDefinition_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_tableContext definition_table() throws RecognitionException {
		Definition_tableContext _localctx = new Definition_tableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_definition_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT_SYMBOL) {
				{
				{
				setState(368); annotation();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374); match(DEFINE);
			setState(375); match(TABLE);
			setState(376); source();
			setState(377); match(OPEN_PAR);
			setState(378); attribute_name();
			setState(379); attribute_type();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(380); match(COMMA);
				setState(381); attribute_name();
				setState(382); attribute_type();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389); match(CLOSE_PAR);
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

	public static class Definition_window_finalContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SiddhiQLParser.EOF, 0); }
		public Definition_windowContext definition_window() {
			return getRuleContext(Definition_windowContext.class,0);
		}
		public Definition_window_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_window_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterDefinition_window_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitDefinition_window_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_window_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_window_finalContext definition_window_final() throws RecognitionException {
		Definition_window_finalContext _localctx = new Definition_window_finalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_definition_window_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391); definition_window();
			setState(393);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(392); match(SCOL);
				}
			}

			setState(395); match(EOF);
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

	public static class Definition_windowContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TerminalNode DEFINE() { return getToken(SiddhiQLParser.DEFINE, 0); }
		public Attribute_typeContext attribute_type(int i) {
			return getRuleContext(Attribute_typeContext.class,i);
		}
		public List<Attribute_typeContext> attribute_type() {
			return getRuleContexts(Attribute_typeContext.class);
		}
		public Function_operationContext function_operation() {
			return getRuleContext(Function_operationContext.class,0);
		}
		public TerminalNode OUTPUT() { return getToken(SiddhiQLParser.OUTPUT, 0); }
		public TerminalNode WINDOW() { return getToken(SiddhiQLParser.WINDOW, 0); }
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Output_event_typeContext output_event_type() {
			return getRuleContext(Output_event_typeContext.class,0);
		}
		public Attribute_nameContext attribute_name(int i) {
			return getRuleContext(Attribute_nameContext.class,i);
		}
		public List<Attribute_nameContext> attribute_name() {
			return getRuleContexts(Attribute_nameContext.class);
		}
		public Definition_windowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_window; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterDefinition_window(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitDefinition_window(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_window(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_windowContext definition_window() throws RecognitionException {
		Definition_windowContext _localctx = new Definition_windowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_definition_window);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT_SYMBOL) {
				{
				{
				setState(397); annotation();
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(403); match(DEFINE);
			setState(404); match(WINDOW);
			setState(405); source();
			setState(406); match(OPEN_PAR);
			setState(407); attribute_name();
			setState(408); attribute_type();
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(409); match(COMMA);
				setState(410); attribute_name();
				setState(411); attribute_type();
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418); match(CLOSE_PAR);
			setState(419); function_operation();
			setState(422);
			_la = _input.LA(1);
			if (_la==OUTPUT) {
				{
				setState(420); match(OUTPUT);
				setState(421); output_event_type();
				}
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

	public static class Store_query_finalContext extends ParserRuleContext {
		public Store_queryContext store_query() {
			return getRuleContext(Store_queryContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SiddhiQLParser.EOF, 0); }
		public Store_query_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_store_query_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterStore_query_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitStore_query_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitStore_query_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Store_query_finalContext store_query_final() throws RecognitionException {
		Store_query_finalContext _localctx = new Store_query_finalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_store_query_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424); store_query();
			setState(426);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(425); match(SCOL);
				}
			}

			setState(428); match(EOF);
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

	public static class Store_queryContext extends ParserRuleContext {
		public Store_inputContext store_input() {
			return getRuleContext(Store_inputContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SiddhiQLParser.FROM, 0); }
		public Query_sectionContext query_section() {
			return getRuleContext(Query_sectionContext.class,0);
		}
		public Store_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_store_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterStore_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitStore_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitStore_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Store_queryContext store_query() throws RecognitionException {
		Store_queryContext _localctx = new Store_queryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_store_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); match(FROM);
			setState(431); store_input();
			setState(433);
			_la = _input.LA(1);
			if (_la==SELECT) {
				{
				setState(432); query_section();
				}
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

	public static class Store_inputContext extends ParserRuleContext {
		public Source_idContext source_id() {
			return getRuleContext(Source_idContext.class,0);
		}
		public TerminalNode ON() { return getToken(SiddhiQLParser.ON, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public PerContext per() {
			return getRuleContext(PerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Within_time_rangeContext within_time_range() {
			return getRuleContext(Within_time_rangeContext.class,0);
		}
		public TerminalNode AS() { return getToken(SiddhiQLParser.AS, 0); }
		public Store_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_store_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterStore_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitStore_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitStore_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Store_inputContext store_input() throws RecognitionException {
		Store_inputContext _localctx = new Store_inputContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_store_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); source_id();
			setState(438);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(436); match(AS);
				setState(437); alias();
				}
			}

			setState(442);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(440); match(ON);
				setState(441); expression();
				}
			}

			setState(447);
			_la = _input.LA(1);
			if (_la==WITHIN) {
				{
				setState(444); within_time_range();
				setState(445); per();
				}
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

	public static class Definition_function_finalContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SiddhiQLParser.EOF, 0); }
		public Definition_functionContext definition_function() {
			return getRuleContext(Definition_functionContext.class,0);
		}
		public Definition_function_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_function_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterDefinition_function_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitDefinition_function_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_function_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_function_finalContext definition_function_final() throws RecognitionException {
		Definition_function_finalContext _localctx = new Definition_function_finalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_definition_function_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449); definition_function();
			setState(451);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(450); match(SCOL);
				}
			}

			setState(453); match(EOF);
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

	public static class Definition_functionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(SiddhiQLParser.FUNCTION, 0); }
		public TerminalNode RETURN() { return getToken(SiddhiQLParser.RETURN, 0); }
		public TerminalNode DEFINE() { return getToken(SiddhiQLParser.DEFINE, 0); }
		public Attribute_typeContext attribute_type() {
			return getRuleContext(Attribute_typeContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Language_nameContext language_name() {
			return getRuleContext(Language_nameContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Definition_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterDefinition_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitDefinition_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_functionContext definition_function() throws RecognitionException {
		Definition_functionContext _localctx = new Definition_functionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_definition_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455); match(DEFINE);
			setState(456); match(FUNCTION);
			setState(457); function_name();
			setState(458); match(OPEN_SQARE_BRACKETS);
			setState(459); language_name();
			setState(460); match(CLOASE_SQARE_BRACKETS);
			setState(461); match(RETURN);
			setState(462); attribute_type();
			setState(463); function_body();
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

	public static class Function_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465); id();
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

	public static class Language_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Language_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_language_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterLanguage_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitLanguage_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitLanguage_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Language_nameContext language_name() throws RecognitionException {
		Language_nameContext _localctx = new Language_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_language_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467); id();
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

	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode SCRIPT() { return getToken(SiddhiQLParser.SCRIPT, 0); }
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469); match(SCRIPT);
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

	public static class Definition_trigger_finalContext extends ParserRuleContext {
		public Definition_triggerContext definition_trigger() {
			return getRuleContext(Definition_triggerContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SiddhiQLParser.EOF, 0); }
		public Definition_trigger_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_trigger_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterDefinition_trigger_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitDefinition_trigger_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_trigger_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_trigger_finalContext definition_trigger_final() throws RecognitionException {
		Definition_trigger_finalContext _localctx = new Definition_trigger_finalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_definition_trigger_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471); definition_trigger();
			setState(473);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(472); match(SCOL);
				}
			}

			setState(475); match(EOF);
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

	public static class Definition_triggerContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(SiddhiQLParser.AT, 0); }
		public TerminalNode DEFINE() { return getToken(SiddhiQLParser.DEFINE, 0); }
		public Time_valueContext time_value() {
			return getRuleContext(Time_valueContext.class,0);
		}
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode TRIGGER() { return getToken(SiddhiQLParser.TRIGGER, 0); }
		public TerminalNode EVERY() { return getToken(SiddhiQLParser.EVERY, 0); }
		public Definition_triggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_trigger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterDefinition_trigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitDefinition_trigger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_trigger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_triggerContext definition_trigger() throws RecognitionException {
		Definition_triggerContext _localctx = new Definition_triggerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_definition_trigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477); match(DEFINE);
			setState(478); match(TRIGGER);
			setState(479); trigger_name();
			setState(480); match(AT);
			setState(484);
			switch (_input.LA(1)) {
			case EVERY:
				{
				setState(481); match(EVERY);
				setState(482); time_value();
				}
				break;
			case STRING_LITERAL:
				{
				setState(483); string_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Trigger_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486); id();
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

	public static class Definition_aggregation_finalContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SiddhiQLParser.EOF, 0); }
		public Definition_aggregationContext definition_aggregation() {
			return getRuleContext(Definition_aggregationContext.class,0);
		}
		public Definition_aggregation_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_aggregation_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterDefinition_aggregation_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitDefinition_aggregation_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_aggregation_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_aggregation_finalContext definition_aggregation_final() throws RecognitionException {
		Definition_aggregation_finalContext _localctx = new Definition_aggregation_finalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_definition_aggregation_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488); definition_aggregation();
			setState(490);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(489); match(SCOL);
				}
			}

			setState(492); match(EOF);
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

	public static class Definition_aggregationContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TerminalNode AGGREGATE() { return getToken(SiddhiQLParser.AGGREGATE, 0); }
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SiddhiQLParser.FROM, 0); }
		public Aggregation_timeContext aggregation_time() {
			return getRuleContext(Aggregation_timeContext.class,0);
		}
		public TerminalNode EVERY() { return getToken(SiddhiQLParser.EVERY, 0); }
		public Aggregation_nameContext aggregation_name() {
			return getRuleContext(Aggregation_nameContext.class,0);
		}
		public TerminalNode DEFINE() { return getToken(SiddhiQLParser.DEFINE, 0); }
		public TerminalNode AGGREGATION() { return getToken(SiddhiQLParser.AGGREGATION, 0); }
		public Group_by_query_selectionContext group_by_query_selection() {
			return getRuleContext(Group_by_query_selectionContext.class,0);
		}
		public Standard_streamContext standard_stream() {
			return getRuleContext(Standard_streamContext.class,0);
		}
		public Attribute_referenceContext attribute_reference() {
			return getRuleContext(Attribute_referenceContext.class,0);
		}
		public TerminalNode BY() { return getToken(SiddhiQLParser.BY, 0); }
		public Definition_aggregationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_aggregation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterDefinition_aggregation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitDefinition_aggregation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_aggregation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_aggregationContext definition_aggregation() throws RecognitionException {
		Definition_aggregationContext _localctx = new Definition_aggregationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_definition_aggregation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT_SYMBOL) {
				{
				{
				setState(494); annotation();
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(500); match(DEFINE);
			setState(501); match(AGGREGATION);
			setState(502); aggregation_name();
			setState(503); match(FROM);
			setState(504); standard_stream();
			setState(505); group_by_query_selection();
			setState(506); match(AGGREGATE);
			setState(509);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(507); match(BY);
				setState(508); attribute_reference();
				}
			}

			setState(511); match(EVERY);
			setState(512); aggregation_time();
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

	public static class Aggregation_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Aggregation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterAggregation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitAggregation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAggregation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregation_nameContext aggregation_name() throws RecognitionException {
		Aggregation_nameContext _localctx = new Aggregation_nameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_aggregation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514); id();
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

	public static class Aggregation_timeContext extends ParserRuleContext {
		public Aggregation_time_intervalContext aggregation_time_interval() {
			return getRuleContext(Aggregation_time_intervalContext.class,0);
		}
		public Aggregation_time_rangeContext aggregation_time_range() {
			return getRuleContext(Aggregation_time_rangeContext.class,0);
		}
		public Aggregation_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterAggregation_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitAggregation_time(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAggregation_time(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregation_timeContext aggregation_time() throws RecognitionException {
		Aggregation_timeContext _localctx = new Aggregation_timeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_aggregation_time);
		try {
			setState(518);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(516); aggregation_time_range();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(517); aggregation_time_interval();
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

	public static class Aggregation_time_durationContext extends ParserRuleContext {
		public TerminalNode HOURS() { return getToken(SiddhiQLParser.HOURS, 0); }
		public TerminalNode DAYS() { return getToken(SiddhiQLParser.DAYS, 0); }
		public TerminalNode SECONDS() { return getToken(SiddhiQLParser.SECONDS, 0); }
		public TerminalNode WEEKS() { return getToken(SiddhiQLParser.WEEKS, 0); }
		public TerminalNode YEARS() { return getToken(SiddhiQLParser.YEARS, 0); }
		public TerminalNode MONTHS() { return getToken(SiddhiQLParser.MONTHS, 0); }
		public TerminalNode MINUTES() { return getToken(SiddhiQLParser.MINUTES, 0); }
		public Aggregation_time_durationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation_time_duration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterAggregation_time_duration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitAggregation_time_duration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAggregation_time_duration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregation_time_durationContext aggregation_time_duration() throws RecognitionException {
		Aggregation_time_durationContext _localctx = new Aggregation_time_durationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_aggregation_time_duration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (YEARS - 80)) | (1L << (MONTHS - 80)) | (1L << (WEEKS - 80)) | (1L << (DAYS - 80)) | (1L << (HOURS - 80)) | (1L << (MINUTES - 80)) | (1L << (SECONDS - 80)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Aggregation_time_rangeContext extends ParserRuleContext {
		public Aggregation_time_durationContext aggregation_time_duration(int i) {
			return getRuleContext(Aggregation_time_durationContext.class,i);
		}
		public List<Aggregation_time_durationContext> aggregation_time_duration() {
			return getRuleContexts(Aggregation_time_durationContext.class);
		}
		public TerminalNode TRIPLE_DOT() { return getToken(SiddhiQLParser.TRIPLE_DOT, 0); }
		public Aggregation_time_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation_time_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterAggregation_time_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitAggregation_time_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAggregation_time_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregation_time_rangeContext aggregation_time_range() throws RecognitionException {
		Aggregation_time_rangeContext _localctx = new Aggregation_time_rangeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_aggregation_time_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522); aggregation_time_duration();
			setState(523); match(TRIPLE_DOT);
			setState(524); aggregation_time_duration();
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

	public static class Aggregation_time_intervalContext extends ParserRuleContext {
		public Aggregation_time_durationContext aggregation_time_duration(int i) {
			return getRuleContext(Aggregation_time_durationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SiddhiQLParser.COMMA); }
		public List<Aggregation_time_durationContext> aggregation_time_duration() {
			return getRuleContexts(Aggregation_time_durationContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SiddhiQLParser.COMMA, i);
		}
		public Aggregation_time_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation_time_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterAggregation_time_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitAggregation_time_interval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAggregation_time_interval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregation_time_intervalContext aggregation_time_interval() throws RecognitionException {
		Aggregation_time_intervalContext _localctx = new Aggregation_time_intervalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_aggregation_time_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526); aggregation_time_duration();
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(527); match(COMMA);
				setState(528); aggregation_time_duration();
				}
				}
				setState(533);
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

	public static class AnnotationContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public Annotation_elementContext annotation_element(int i) {
			return getRuleContext(Annotation_elementContext.class,i);
		}
		public List<Annotation_elementContext> annotation_element() {
			return getRuleContexts(Annotation_elementContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534); match(AT_SYMBOL);
			setState(535); name();
			setState(553);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(536); match(OPEN_PAR);
				setState(539);
				switch (_input.LA(1)) {
				case STREAM:
				case DEFINE:
				case TABLE:
				case FROM:
				case PARTITION:
				case WINDOW:
				case SELECT:
				case GROUP:
				case BY:
				case HAVING:
				case INSERT:
				case DELETE:
				case UPDATE:
				case RETURN:
				case EVENTS:
				case INTO:
				case OUTPUT:
				case EXPIRED:
				case CURRENT:
				case SNAPSHOT:
				case FOR:
				case RAW:
				case OF:
				case AS:
				case OR:
				case AND:
				case ON:
				case IS:
				case NOT:
				case WITHIN:
				case WITH:
				case BEGIN:
				case END:
				case NULL:
				case EVERY:
				case LAST:
				case ALL:
				case FIRST:
				case JOIN:
				case INNER:
				case OUTER:
				case RIGHT:
				case LEFT:
				case FULL:
				case UNIDIRECTIONAL:
				case YEARS:
				case MONTHS:
				case WEEKS:
				case DAYS:
				case HOURS:
				case MINUTES:
				case SECONDS:
				case MILLISECONDS:
				case FALSE:
				case TRUE:
				case STRING:
				case INT:
				case LONG:
				case FLOAT:
				case DOUBLE:
				case BOOL:
				case OBJECT:
				case ID_QUOTES:
				case ID:
				case STRING_LITERAL:
					{
					setState(537); annotation_element();
					}
					break;
				case AT_SYMBOL:
					{
					setState(538); annotation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(541); match(COMMA);
					setState(544);
					switch (_input.LA(1)) {
					case STREAM:
					case DEFINE:
					case TABLE:
					case FROM:
					case PARTITION:
					case WINDOW:
					case SELECT:
					case GROUP:
					case BY:
					case HAVING:
					case INSERT:
					case DELETE:
					case UPDATE:
					case RETURN:
					case EVENTS:
					case INTO:
					case OUTPUT:
					case EXPIRED:
					case CURRENT:
					case SNAPSHOT:
					case FOR:
					case RAW:
					case OF:
					case AS:
					case OR:
					case AND:
					case ON:
					case IS:
					case NOT:
					case WITHIN:
					case WITH:
					case BEGIN:
					case END:
					case NULL:
					case EVERY:
					case LAST:
					case ALL:
					case FIRST:
					case JOIN:
					case INNER:
					case OUTER:
					case RIGHT:
					case LEFT:
					case FULL:
					case UNIDIRECTIONAL:
					case YEARS:
					case MONTHS:
					case WEEKS:
					case DAYS:
					case HOURS:
					case MINUTES:
					case SECONDS:
					case MILLISECONDS:
					case FALSE:
					case TRUE:
					case STRING:
					case INT:
					case LONG:
					case FLOAT:
					case DOUBLE:
					case BOOL:
					case OBJECT:
					case ID_QUOTES:
					case ID:
					case STRING_LITERAL:
						{
						setState(542); annotation_element();
						}
						break;
					case AT_SYMBOL:
						{
						setState(543); annotation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(550);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(551); match(CLOSE_PAR);
				}
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

	public static class App_annotationContext extends ParserRuleContext {
		public Annotation_elementContext annotation_element(int i) {
			return getRuleContext(Annotation_elementContext.class,i);
		}
		public TerminalNode APP() { return getToken(SiddhiQLParser.APP, 0); }
		public List<Annotation_elementContext> annotation_element() {
			return getRuleContexts(Annotation_elementContext.class);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public App_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_app_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterApp_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitApp_annotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitApp_annotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final App_annotationContext app_annotation() throws RecognitionException {
		App_annotationContext _localctx = new App_annotationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_app_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555); match(AT_SYMBOL);
			setState(556); match(APP);
			setState(557); match(COL);
			setState(558); name();
			setState(570);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(559); match(OPEN_PAR);
				setState(560); annotation_element();
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(561); match(COMMA);
					setState(562); annotation_element();
					}
					}
					setState(567);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(568); match(CLOSE_PAR);
				}
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

	public static class Annotation_elementContext extends ParserRuleContext {
		public Property_valueContext property_value() {
			return getRuleContext(Property_valueContext.class,0);
		}
		public Property_nameContext property_name() {
			return getRuleContext(Property_nameContext.class,0);
		}
		public Annotation_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterAnnotation_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitAnnotation_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAnnotation_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Annotation_elementContext annotation_element() throws RecognitionException {
		Annotation_elementContext _localctx = new Annotation_elementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_annotation_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STREAM) | (1L << DEFINE) | (1L << TABLE) | (1L << FROM) | (1L << PARTITION) | (1L << WINDOW) | (1L << SELECT) | (1L << GROUP) | (1L << BY) | (1L << HAVING) | (1L << INSERT) | (1L << DELETE) | (1L << UPDATE) | (1L << RETURN) | (1L << EVENTS) | (1L << INTO) | (1L << OUTPUT) | (1L << EXPIRED) | (1L << CURRENT) | (1L << SNAPSHOT) | (1L << FOR) | (1L << RAW) | (1L << OF) | (1L << AS) | (1L << OR) | (1L << AND) | (1L << ON) | (1L << IS) | (1L << NOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WITHIN - 64)) | (1L << (WITH - 64)) | (1L << (BEGIN - 64)) | (1L << (END - 64)) | (1L << (NULL - 64)) | (1L << (EVERY - 64)) | (1L << (LAST - 64)) | (1L << (ALL - 64)) | (1L << (FIRST - 64)) | (1L << (JOIN - 64)) | (1L << (INNER - 64)) | (1L << (OUTER - 64)) | (1L << (RIGHT - 64)) | (1L << (LEFT - 64)) | (1L << (FULL - 64)) | (1L << (UNIDIRECTIONAL - 64)) | (1L << (YEARS - 64)) | (1L << (MONTHS - 64)) | (1L << (WEEKS - 64)) | (1L << (DAYS - 64)) | (1L << (HOURS - 64)) | (1L << (MINUTES - 64)) | (1L << (SECONDS - 64)) | (1L << (MILLISECONDS - 64)) | (1L << (FALSE - 64)) | (1L << (TRUE - 64)) | (1L << (STRING - 64)) | (1L << (INT - 64)) | (1L << (LONG - 64)) | (1L << (FLOAT - 64)) | (1L << (DOUBLE - 64)) | (1L << (BOOL - 64)) | (1L << (OBJECT - 64)) | (1L << (ID_QUOTES - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				setState(572); property_name();
				setState(573); match(ASSIGN);
				}
			}

			setState(577); property_value();
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

	public static class PartitionContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SiddhiQLParser.WITH, 0); }
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public TerminalNode PARTITION() { return getToken(SiddhiQLParser.PARTITION, 0); }
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public Partition_with_streamContext partition_with_stream(int i) {
			return getRuleContext(Partition_with_streamContext.class,i);
		}
		public TerminalNode BEGIN() { return getToken(SiddhiQLParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(SiddhiQLParser.END, 0); }
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<Partition_with_streamContext> partition_with_stream() {
			return getRuleContexts(Partition_with_streamContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public PartitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterPartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitPartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitPartition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionContext partition() throws RecognitionException {
		PartitionContext _localctx = new PartitionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_partition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT_SYMBOL) {
				{
				{
				setState(579); annotation();
				}
				}
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(585); match(PARTITION);
			setState(586); match(WITH);
			setState(587); match(OPEN_PAR);
			setState(588); partition_with_stream();
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(589); match(COMMA);
				setState(590); partition_with_stream();
				}
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(596); match(CLOSE_PAR);
			setState(597); match(BEGIN);
			setState(600);
			switch (_input.LA(1)) {
			case AT_SYMBOL:
			case FROM:
				{
				setState(598); query();
				}
				break;
			case UNEXPECTED_CHAR:
				{
				setState(599); error();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(609);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(602); match(SCOL);
					setState(605);
					switch (_input.LA(1)) {
					case AT_SYMBOL:
					case FROM:
						{
						setState(603); query();
						}
						break;
					case UNEXPECTED_CHAR:
						{
						setState(604); error();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(613);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(612); match(SCOL);
				}
			}

			setState(615); match(END);
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

	public static class Partition_finalContext extends ParserRuleContext {
		public PartitionContext partition() {
			return getRuleContext(PartitionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SiddhiQLParser.EOF, 0); }
		public Partition_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterPartition_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitPartition_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitPartition_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_finalContext partition_final() throws RecognitionException {
		Partition_finalContext _localctx = new Partition_finalContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_partition_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617); partition();
			setState(619);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(618); match(SCOL);
				}
			}

			setState(621); match(EOF);
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

	public static class Partition_with_streamContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public Condition_rangesContext condition_ranges() {
			return getRuleContext(Condition_rangesContext.class,0);
		}
		public TerminalNode OF() { return getToken(SiddhiQLParser.OF, 0); }
		public Stream_idContext stream_id() {
			return getRuleContext(Stream_idContext.class,0);
		}
		public Partition_with_streamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_with_stream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterPartition_with_stream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitPartition_with_stream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitPartition_with_stream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_with_streamContext partition_with_stream() throws RecognitionException {
		Partition_with_streamContext _localctx = new Partition_with_streamContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_partition_with_stream);
		try {
			setState(631);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(623); attribute();
				setState(624); match(OF);
				setState(625); stream_id();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(627); condition_ranges();
				setState(628); match(OF);
				setState(629); stream_id();
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

	public static class Condition_rangesContext extends ParserRuleContext {
		public Condition_rangeContext condition_range(int i) {
			return getRuleContext(Condition_rangeContext.class,i);
		}
		public List<Condition_rangeContext> condition_range() {
			return getRuleContexts(Condition_rangeContext.class);
		}
		public List<TerminalNode> OR() { return getTokens(SiddhiQLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SiddhiQLParser.OR, i);
		}
		public Condition_rangesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_ranges; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterCondition_ranges(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitCondition_ranges(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitCondition_ranges(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_rangesContext condition_ranges() throws RecognitionException {
		Condition_rangesContext _localctx = new Condition_rangesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_condition_ranges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633); condition_range();
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(634); match(OR);
				setState(635); condition_range();
				}
				}
				setState(640);
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

	public static class Condition_rangeContext extends ParserRuleContext {
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SiddhiQLParser.AS, 0); }
		public Condition_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterCondition_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitCondition_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitCondition_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_rangeContext condition_range() throws RecognitionException {
		Condition_rangeContext _localctx = new Condition_rangeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_condition_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641); expression();
			setState(642); match(AS);
			setState(643); string_value();
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

	public static class Query_finalContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SiddhiQLParser.EOF, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public Query_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterQuery_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitQuery_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitQuery_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_finalContext query_final() throws RecognitionException {
		Query_finalContext _localctx = new Query_finalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_query_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645); query();
			setState(647);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(646); match(SCOL);
				}
			}

			setState(649); match(EOF);
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

	public static class QueryContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public Output_rateContext output_rate() {
			return getRuleContext(Output_rateContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SiddhiQLParser.FROM, 0); }
		public Query_inputContext query_input() {
			return getRuleContext(Query_inputContext.class,0);
		}
		public Query_sectionContext query_section() {
			return getRuleContext(Query_sectionContext.class,0);
		}
		public Query_outputContext query_output() {
			return getRuleContext(Query_outputContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT_SYMBOL) {
				{
				{
				setState(651); annotation();
				}
				}
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(657); match(FROM);
			setState(658); query_input();
			setState(660);
			_la = _input.LA(1);
			if (_la==SELECT) {
				{
				setState(659); query_section();
				}
			}

			setState(663);
			_la = _input.LA(1);
			if (_la==OUTPUT) {
				{
				setState(662); output_rate();
				}
			}

			setState(665); query_output();
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

	public static class Query_inputContext extends ParserRuleContext {
		public Anonymous_streamContext anonymous_stream() {
			return getRuleContext(Anonymous_streamContext.class,0);
		}
		public Join_streamContext join_stream() {
			return getRuleContext(Join_streamContext.class,0);
		}
		public Sequence_streamContext sequence_stream() {
			return getRuleContext(Sequence_streamContext.class,0);
		}
		public Pattern_streamContext pattern_stream() {
			return getRuleContext(Pattern_streamContext.class,0);
		}
		public Standard_streamContext standard_stream() {
			return getRuleContext(Standard_streamContext.class,0);
		}
		public Query_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterQuery_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitQuery_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitQuery_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_inputContext query_input() throws RecognitionException {
		Query_inputContext _localctx = new Query_inputContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_query_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(667); standard_stream();
				}
				break;

			case 2:
				{
				setState(668); join_stream();
				}
				break;

			case 3:
				{
				setState(669); pattern_stream();
				}
				break;

			case 4:
				{
				setState(670); sequence_stream();
				}
				break;

			case 5:
				{
				setState(671); anonymous_stream();
				}
				break;
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

	public static class Standard_streamContext extends ParserRuleContext {
		public Basic_source_stream_handlersContext pre_window_handlers;
		public Basic_source_stream_handlersContext post_window_handlers;
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public WindowContext window() {
			return getRuleContext(WindowContext.class,0);
		}
		public List<Basic_source_stream_handlersContext> basic_source_stream_handlers() {
			return getRuleContexts(Basic_source_stream_handlersContext.class);
		}
		public Basic_source_stream_handlersContext basic_source_stream_handlers(int i) {
			return getRuleContext(Basic_source_stream_handlersContext.class,i);
		}
		public Standard_streamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standard_stream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterStandard_stream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitStandard_stream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitStandard_stream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Standard_streamContext standard_stream() throws RecognitionException {
		Standard_streamContext _localctx = new Standard_streamContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_standard_stream);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674); source();
			setState(676);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(675); ((Standard_streamContext)_localctx).pre_window_handlers = basic_source_stream_handlers();
				}
				break;
			}
			setState(679);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(678); window();
				}
				break;
			}
			setState(682);
			_la = _input.LA(1);
			if (_la==OPEN_SQARE_BRACKETS || _la==HASH) {
				{
				setState(681); ((Standard_streamContext)_localctx).post_window_handlers = basic_source_stream_handlers();
				}
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

	public static class Join_streamContext extends ParserRuleContext {
		public Join_sourceContext left_source;
		public Join_sourceContext right_source;
		public Token right_unidirectional;
		public Token left_unidirectional;
		public TerminalNode ON() { return getToken(SiddhiQLParser.ON, 0); }
		public TerminalNode UNIDIRECTIONAL() { return getToken(SiddhiQLParser.UNIDIRECTIONAL, 0); }
		public List<Join_sourceContext> join_source() {
			return getRuleContexts(Join_sourceContext.class);
		}
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public PerContext per() {
			return getRuleContext(PerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Within_time_rangeContext within_time_range() {
			return getRuleContext(Within_time_rangeContext.class,0);
		}
		public Join_sourceContext join_source(int i) {
			return getRuleContext(Join_sourceContext.class,i);
		}
		public Join_streamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_stream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterJoin_stream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitJoin_stream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitJoin_stream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_streamContext join_stream() throws RecognitionException {
		Join_streamContext _localctx = new Join_streamContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_join_stream);
		int _la;
		try {
			setState(722);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(684); ((Join_streamContext)_localctx).left_source = join_source();
				setState(685); join();
				setState(686); ((Join_streamContext)_localctx).right_source = join_source();
				setState(687); ((Join_streamContext)_localctx).right_unidirectional = match(UNIDIRECTIONAL);
				setState(690);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(688); match(ON);
					setState(689); expression();
					}
				}

				setState(695);
				_la = _input.LA(1);
				if (_la==WITHIN) {
					{
					setState(692); within_time_range();
					setState(693); per();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(697); ((Join_streamContext)_localctx).left_source = join_source();
				setState(698); join();
				setState(699); ((Join_streamContext)_localctx).right_source = join_source();
				setState(702);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(700); match(ON);
					setState(701); expression();
					}
				}

				setState(707);
				_la = _input.LA(1);
				if (_la==WITHIN) {
					{
					setState(704); within_time_range();
					setState(705); per();
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(709); ((Join_streamContext)_localctx).left_source = join_source();
				setState(710); ((Join_streamContext)_localctx).left_unidirectional = match(UNIDIRECTIONAL);
				setState(711); join();
				setState(712); ((Join_streamContext)_localctx).right_source = join_source();
				setState(715);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(713); match(ON);
					setState(714); expression();
					}
				}

				setState(720);
				_la = _input.LA(1);
				if (_la==WITHIN) {
					{
					setState(717); within_time_range();
					setState(718); per();
					}
				}

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

	public static class Join_sourceContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public Basic_source_stream_handlersContext basic_source_stream_handlers() {
			return getRuleContext(Basic_source_stream_handlersContext.class,0);
		}
		public WindowContext window() {
			return getRuleContext(WindowContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SiddhiQLParser.AS, 0); }
		public Join_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterJoin_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitJoin_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitJoin_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_sourceContext join_source() throws RecognitionException {
		Join_sourceContext _localctx = new Join_sourceContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_join_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724); source();
			setState(726);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(725); basic_source_stream_handlers();
				}
				break;
			}
			setState(729);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(728); window();
				}
			}

			setState(733);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(731); match(AS);
				setState(732); alias();
				}
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

	public static class Pattern_streamContext extends ParserRuleContext {
		public Every_pattern_source_chainContext every_pattern_source_chain() {
			return getRuleContext(Every_pattern_source_chainContext.class,0);
		}
		public Pattern_streamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_stream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterPattern_stream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitPattern_stream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitPattern_stream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_streamContext pattern_stream() throws RecognitionException {
		Pattern_streamContext _localctx = new Pattern_streamContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_pattern_stream);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735); every_pattern_source_chain(0);
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

	public static class Every_pattern_source_chainContext extends ParserRuleContext {
		public Within_timeContext within_time() {
			return getRuleContext(Within_timeContext.class,0);
		}
		public Pattern_source_chainContext pattern_source_chain() {
			return getRuleContext(Pattern_source_chainContext.class,0);
		}
		public List<Every_pattern_source_chainContext> every_pattern_source_chain() {
			return getRuleContexts(Every_pattern_source_chainContext.class);
		}
		public Every_pattern_source_chainContext every_pattern_source_chain(int i) {
			return getRuleContext(Every_pattern_source_chainContext.class,i);
		}
		public TerminalNode EVERY() { return getToken(SiddhiQLParser.EVERY, 0); }
		public Pattern_sourceContext pattern_source() {
			return getRuleContext(Pattern_sourceContext.class,0);
		}
		public Every_pattern_source_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_every_pattern_source_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterEvery_pattern_source_chain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitEvery_pattern_source_chain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitEvery_pattern_source_chain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Every_pattern_source_chainContext every_pattern_source_chain() throws RecognitionException {
		return every_pattern_source_chain(0);
	}

	private Every_pattern_source_chainContext every_pattern_source_chain(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Every_pattern_source_chainContext _localctx = new Every_pattern_source_chainContext(_ctx, _parentState);
		Every_pattern_source_chainContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_every_pattern_source_chain, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(738); match(OPEN_PAR);
				setState(739); every_pattern_source_chain(0);
				setState(740); match(CLOSE_PAR);
				setState(742);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(741); within_time();
					}
					break;
				}
				}
				break;

			case 2:
				{
				setState(744); match(EVERY);
				setState(745); match(OPEN_PAR);
				setState(746); pattern_source_chain(0);
				setState(747); match(CLOSE_PAR);
				setState(749);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(748); within_time();
					}
					break;
				}
				}
				break;

			case 3:
				{
				setState(751); pattern_source_chain(0);
				}
				break;

			case 4:
				{
				setState(752); match(EVERY);
				setState(753); pattern_source();
				setState(755);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(754); within_time();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(764);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Every_pattern_source_chainContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_every_pattern_source_chain);
					setState(759);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(760); match(FOLLOWED_BY);
					setState(761); every_pattern_source_chain(4);
					}
					} 
				}
				setState(766);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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

	public static class Pattern_source_chainContext extends ParserRuleContext {
		public Within_timeContext within_time() {
			return getRuleContext(Within_timeContext.class,0);
		}
		public List<Pattern_source_chainContext> pattern_source_chain() {
			return getRuleContexts(Pattern_source_chainContext.class);
		}
		public Pattern_source_chainContext pattern_source_chain(int i) {
			return getRuleContext(Pattern_source_chainContext.class,i);
		}
		public Pattern_sourceContext pattern_source() {
			return getRuleContext(Pattern_sourceContext.class,0);
		}
		public Pattern_source_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_source_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterPattern_source_chain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitPattern_source_chain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitPattern_source_chain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_source_chainContext pattern_source_chain() throws RecognitionException {
		return pattern_source_chain(0);
	}

	private Pattern_source_chainContext pattern_source_chain(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Pattern_source_chainContext _localctx = new Pattern_source_chainContext(_ctx, _parentState);
		Pattern_source_chainContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_pattern_source_chain, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(768); match(OPEN_PAR);
				setState(769); pattern_source_chain(0);
				setState(770); match(CLOSE_PAR);
				setState(772);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(771); within_time();
					}
					break;
				}
				}
				break;
			case HASH:
			case STREAM:
			case DEFINE:
			case TABLE:
			case FROM:
			case PARTITION:
			case WINDOW:
			case SELECT:
			case GROUP:
			case BY:
			case HAVING:
			case INSERT:
			case DELETE:
			case UPDATE:
			case RETURN:
			case EVENTS:
			case INTO:
			case OUTPUT:
			case EXPIRED:
			case CURRENT:
			case SNAPSHOT:
			case FOR:
			case RAW:
			case OF:
			case AS:
			case OR:
			case AND:
			case ON:
			case IS:
			case NOT:
			case WITHIN:
			case WITH:
			case BEGIN:
			case END:
			case NULL:
			case EVERY:
			case LAST:
			case ALL:
			case FIRST:
			case JOIN:
			case INNER:
			case OUTER:
			case RIGHT:
			case LEFT:
			case FULL:
			case UNIDIRECTIONAL:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case HOURS:
			case MINUTES:
			case SECONDS:
			case MILLISECONDS:
			case FALSE:
			case TRUE:
			case STRING:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case BOOL:
			case OBJECT:
			case ID_QUOTES:
			case ID:
				{
				setState(774); pattern_source();
				setState(776);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(775); within_time();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(785);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Pattern_source_chainContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pattern_source_chain);
					setState(780);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(781); match(FOLLOWED_BY);
					setState(782); pattern_source_chain(3);
					}
					} 
				}
				setState(787);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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

	public static class Pattern_sourceContext extends ParserRuleContext {
		public Logical_stateful_sourceContext logical_stateful_source() {
			return getRuleContext(Logical_stateful_sourceContext.class,0);
		}
		public Standard_stateful_sourceContext standard_stateful_source() {
			return getRuleContext(Standard_stateful_sourceContext.class,0);
		}
		public Pattern_collection_stateful_sourceContext pattern_collection_stateful_source() {
			return getRuleContext(Pattern_collection_stateful_sourceContext.class,0);
		}
		public Pattern_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterPattern_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitPattern_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitPattern_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_sourceContext pattern_source() throws RecognitionException {
		Pattern_sourceContext _localctx = new Pattern_sourceContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_pattern_source);
		try {
			setState(791);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(788); logical_stateful_source();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(789); pattern_collection_stateful_source();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(790); standard_stateful_source();
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

	public static class Logical_stateful_sourceContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SiddhiQLParser.NOT, 0); }
		public List<Standard_stateful_sourceContext> standard_stateful_source() {
			return getRuleContexts(Standard_stateful_sourceContext.class);
		}
		public TerminalNode AND() { return getToken(SiddhiQLParser.AND, 0); }
		public Standard_stateful_sourceContext standard_stateful_source(int i) {
			return getRuleContext(Standard_stateful_sourceContext.class,i);
		}
		public TerminalNode OR() { return getToken(SiddhiQLParser.OR, 0); }
		public Logical_stateful_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_stateful_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterLogical_stateful_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitLogical_stateful_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitLogical_stateful_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_stateful_sourceContext logical_stateful_source() throws RecognitionException {
		Logical_stateful_sourceContext _localctx = new Logical_stateful_sourceContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_logical_stateful_source);
		try {
			setState(807);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(793); match(NOT);
				setState(794); standard_stateful_source();
				setState(797);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(795); match(AND);
					setState(796); standard_stateful_source();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(799); standard_stateful_source();
				setState(800); match(AND);
				setState(801); standard_stateful_source();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(803); standard_stateful_source();
				setState(804); match(OR);
				setState(805); standard_stateful_source();
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

	public static class Pattern_collection_stateful_sourceContext extends ParserRuleContext {
		public CollectContext collect() {
			return getRuleContext(CollectContext.class,0);
		}
		public Standard_stateful_sourceContext standard_stateful_source() {
			return getRuleContext(Standard_stateful_sourceContext.class,0);
		}
		public Pattern_collection_stateful_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_collection_stateful_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterPattern_collection_stateful_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitPattern_collection_stateful_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitPattern_collection_stateful_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_collection_stateful_sourceContext pattern_collection_stateful_source() throws RecognitionException {
		Pattern_collection_stateful_sourceContext _localctx = new Pattern_collection_stateful_sourceContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_pattern_collection_stateful_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809); standard_stateful_source();
			setState(810); match(LT);
			setState(811); collect();
			setState(812); match(GT);
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

	public static class Standard_stateful_sourceContext extends ParserRuleContext {
		public Basic_sourceContext basic_source() {
			return getRuleContext(Basic_sourceContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public Standard_stateful_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standard_stateful_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterStandard_stateful_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitStandard_stateful_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitStandard_stateful_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Standard_stateful_sourceContext standard_stateful_source() throws RecognitionException {
		Standard_stateful_sourceContext _localctx = new Standard_stateful_sourceContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_standard_stateful_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(814); event();
				setState(815); match(ASSIGN);
				}
				break;
			}
			setState(819); basic_source();
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

	public static class Basic_sourceContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public Basic_source_stream_handlersContext basic_source_stream_handlers() {
			return getRuleContext(Basic_source_stream_handlersContext.class,0);
		}
		public Basic_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterBasic_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitBasic_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitBasic_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_sourceContext basic_source() throws RecognitionException {
		Basic_sourceContext _localctx = new Basic_sourceContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_basic_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821); source();
			setState(823);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(822); basic_source_stream_handlers();
				}
				break;
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

	public static class Basic_source_stream_handlersContext extends ParserRuleContext {
		public List<Basic_source_stream_handlerContext> basic_source_stream_handler() {
			return getRuleContexts(Basic_source_stream_handlerContext.class);
		}
		public Basic_source_stream_handlerContext basic_source_stream_handler(int i) {
			return getRuleContext(Basic_source_stream_handlerContext.class,i);
		}
		public Basic_source_stream_handlersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_source_stream_handlers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterBasic_source_stream_handlers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitBasic_source_stream_handlers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitBasic_source_stream_handlers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_source_stream_handlersContext basic_source_stream_handlers() throws RecognitionException {
		Basic_source_stream_handlersContext _localctx = new Basic_source_stream_handlersContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_basic_source_stream_handlers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(826); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(825); basic_source_stream_handler();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(828); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
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

	public static class Basic_source_stream_handlerContext extends ParserRuleContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public Stream_functionContext stream_function() {
			return getRuleContext(Stream_functionContext.class,0);
		}
		public Basic_source_stream_handlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_source_stream_handler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterBasic_source_stream_handler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitBasic_source_stream_handler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitBasic_source_stream_handler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_source_stream_handlerContext basic_source_stream_handler() throws RecognitionException {
		Basic_source_stream_handlerContext _localctx = new Basic_source_stream_handlerContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_basic_source_stream_handler);
		try {
			setState(832);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(830); filter();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(831); stream_function();
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

	public static class Sequence_streamContext extends ParserRuleContext {
		public Within_timeContext within_time() {
			return getRuleContext(Within_timeContext.class,0);
		}
		public Sequence_sourceContext sequence_source() {
			return getRuleContext(Sequence_sourceContext.class,0);
		}
		public Sequence_source_chainContext sequence_source_chain() {
			return getRuleContext(Sequence_source_chainContext.class,0);
		}
		public TerminalNode EVERY() { return getToken(SiddhiQLParser.EVERY, 0); }
		public Sequence_streamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_stream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterSequence_stream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitSequence_stream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSequence_stream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sequence_streamContext sequence_stream() throws RecognitionException {
		Sequence_streamContext _localctx = new Sequence_streamContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_sequence_stream);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(834); match(EVERY);
				}
				break;
			}
			setState(837); sequence_source();
			setState(839);
			_la = _input.LA(1);
			if (_la==WITHIN) {
				{
				setState(838); within_time();
				}
			}

			setState(841); match(COMMA);
			setState(842); sequence_source_chain(0);
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

	public static class Sequence_source_chainContext extends ParserRuleContext {
		public Within_timeContext within_time() {
			return getRuleContext(Within_timeContext.class,0);
		}
		public Sequence_sourceContext sequence_source() {
			return getRuleContext(Sequence_sourceContext.class,0);
		}
		public Sequence_source_chainContext sequence_source_chain(int i) {
			return getRuleContext(Sequence_source_chainContext.class,i);
		}
		public List<Sequence_source_chainContext> sequence_source_chain() {
			return getRuleContexts(Sequence_source_chainContext.class);
		}
		public Sequence_source_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_source_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterSequence_source_chain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitSequence_source_chain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSequence_source_chain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sequence_source_chainContext sequence_source_chain() throws RecognitionException {
		return sequence_source_chain(0);
	}

	private Sequence_source_chainContext sequence_source_chain(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Sequence_source_chainContext _localctx = new Sequence_source_chainContext(_ctx, _parentState);
		Sequence_source_chainContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_sequence_source_chain, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(845); match(OPEN_PAR);
				setState(846); sequence_source_chain(0);
				setState(847); match(CLOSE_PAR);
				setState(849);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(848); within_time();
					}
					break;
				}
				}
				break;
			case HASH:
			case STREAM:
			case DEFINE:
			case TABLE:
			case FROM:
			case PARTITION:
			case WINDOW:
			case SELECT:
			case GROUP:
			case BY:
			case HAVING:
			case INSERT:
			case DELETE:
			case UPDATE:
			case RETURN:
			case EVENTS:
			case INTO:
			case OUTPUT:
			case EXPIRED:
			case CURRENT:
			case SNAPSHOT:
			case FOR:
			case RAW:
			case OF:
			case AS:
			case OR:
			case AND:
			case ON:
			case IS:
			case NOT:
			case WITHIN:
			case WITH:
			case BEGIN:
			case END:
			case NULL:
			case EVERY:
			case LAST:
			case ALL:
			case FIRST:
			case JOIN:
			case INNER:
			case OUTER:
			case RIGHT:
			case LEFT:
			case FULL:
			case UNIDIRECTIONAL:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case HOURS:
			case MINUTES:
			case SECONDS:
			case MILLISECONDS:
			case FALSE:
			case TRUE:
			case STRING:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case BOOL:
			case OBJECT:
			case ID_QUOTES:
			case ID:
				{
				setState(851); sequence_source();
				setState(853);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(852); within_time();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(862);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Sequence_source_chainContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sequence_source_chain);
					setState(857);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(858); match(COMMA);
					setState(859); sequence_source_chain(3);
					}
					} 
				}
				setState(864);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
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

	public static class Sequence_sourceContext extends ParserRuleContext {
		public Logical_stateful_sourceContext logical_stateful_source() {
			return getRuleContext(Logical_stateful_sourceContext.class,0);
		}
		public Sequence_collection_stateful_sourceContext sequence_collection_stateful_source() {
			return getRuleContext(Sequence_collection_stateful_sourceContext.class,0);
		}
		public Standard_stateful_sourceContext standard_stateful_source() {
			return getRuleContext(Standard_stateful_sourceContext.class,0);
		}
		public Sequence_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterSequence_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitSequence_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSequence_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sequence_sourceContext sequence_source() throws RecognitionException {
		Sequence_sourceContext _localctx = new Sequence_sourceContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_sequence_source);
		try {
			setState(868);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(865); logical_stateful_source();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(866); sequence_collection_stateful_source();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(867); standard_stateful_source();
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

	public static class Sequence_collection_stateful_sourceContext extends ParserRuleContext {
		public Token zero_or_more;
		public Token zero_or_one;
		public Token one_or_more;
		public CollectContext collect() {
			return getRuleContext(CollectContext.class,0);
		}
		public Standard_stateful_sourceContext standard_stateful_source() {
			return getRuleContext(Standard_stateful_sourceContext.class,0);
		}
		public Sequence_collection_stateful_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_collection_stateful_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterSequence_collection_stateful_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitSequence_collection_stateful_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSequence_collection_stateful_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sequence_collection_stateful_sourceContext sequence_collection_stateful_source() throws RecognitionException {
		Sequence_collection_stateful_sourceContext _localctx = new Sequence_collection_stateful_sourceContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_sequence_collection_stateful_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870); standard_stateful_source();
			setState(878);
			switch (_input.LA(1)) {
			case LT:
				{
				setState(871); match(LT);
				setState(872); collect();
				setState(873); match(GT);
				}
				break;
			case STAR:
				{
				setState(875); ((Sequence_collection_stateful_sourceContext)_localctx).zero_or_more = match(STAR);
				}
				break;
			case QUESTION:
				{
				setState(876); ((Sequence_collection_stateful_sourceContext)_localctx).zero_or_one = match(QUESTION);
				}
				break;
			case PLUS:
				{
				setState(877); ((Sequence_collection_stateful_sourceContext)_localctx).one_or_more = match(PLUS);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Anonymous_streamContext extends ParserRuleContext {
		public Anonymous_streamContext anonymous_stream() {
			return getRuleContext(Anonymous_streamContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(SiddhiQLParser.RETURN, 0); }
		public Output_rateContext output_rate() {
			return getRuleContext(Output_rateContext.class,0);
		}
		public Output_event_typeContext output_event_type() {
			return getRuleContext(Output_event_typeContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SiddhiQLParser.FROM, 0); }
		public Query_inputContext query_input() {
			return getRuleContext(Query_inputContext.class,0);
		}
		public Query_sectionContext query_section() {
			return getRuleContext(Query_sectionContext.class,0);
		}
		public Anonymous_streamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_stream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterAnonymous_stream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitAnonymous_stream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAnonymous_stream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Anonymous_streamContext anonymous_stream() throws RecognitionException {
		Anonymous_streamContext _localctx = new Anonymous_streamContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_anonymous_stream);
		int _la;
		try {
			setState(896);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(880); match(OPEN_PAR);
				setState(881); anonymous_stream();
				setState(882); match(CLOSE_PAR);
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(884); match(FROM);
				setState(885); query_input();
				setState(887);
				_la = _input.LA(1);
				if (_la==SELECT) {
					{
					setState(886); query_section();
					}
				}

				setState(890);
				_la = _input.LA(1);
				if (_la==OUTPUT) {
					{
					setState(889); output_rate();
					}
				}

				setState(892); match(RETURN);
				setState(894);
				_la = _input.LA(1);
				if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (EVENTS - 47)) | (1L << (EXPIRED - 47)) | (1L << (CURRENT - 47)) | (1L << (ALL - 47)))) != 0)) {
					{
					setState(893); output_event_type();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FilterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(898); match(HASH);
				}
			}

			setState(901); match(OPEN_SQARE_BRACKETS);
			setState(902); expression();
			setState(903); match(CLOASE_SQARE_BRACKETS);
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

	public static class Stream_functionContext extends ParserRuleContext {
		public Function_operationContext function_operation() {
			return getRuleContext(Function_operationContext.class,0);
		}
		public Stream_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stream_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterStream_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitStream_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitStream_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stream_functionContext stream_function() throws RecognitionException {
		Stream_functionContext _localctx = new Stream_functionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_stream_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905); match(HASH);
			setState(906); function_operation();
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

	public static class WindowContext extends ParserRuleContext {
		public Function_operationContext function_operation() {
			return getRuleContext(Function_operationContext.class,0);
		}
		public TerminalNode WINDOW() { return getToken(SiddhiQLParser.WINDOW, 0); }
		public WindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowContext window() throws RecognitionException {
		WindowContext _localctx = new WindowContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_window);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908); match(HASH);
			setState(909); match(WINDOW);
			setState(910); match(DOT);
			setState(911); function_operation();
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

	public static class Group_by_query_selectionContext extends ParserRuleContext {
		public Group_byContext group_by() {
			return getRuleContext(Group_byContext.class,0);
		}
		public List<Output_attributeContext> output_attribute() {
			return getRuleContexts(Output_attributeContext.class);
		}
		public Output_attributeContext output_attribute(int i) {
			return getRuleContext(Output_attributeContext.class,i);
		}
		public TerminalNode SELECT() { return getToken(SiddhiQLParser.SELECT, 0); }
		public Group_by_query_selectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_query_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterGroup_by_query_selection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitGroup_by_query_selection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitGroup_by_query_selection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_query_selectionContext group_by_query_selection() throws RecognitionException {
		Group_by_query_selectionContext _localctx = new Group_by_query_selectionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_group_by_query_selection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(913); match(SELECT);
			setState(923);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(914); match(STAR);
				}
				break;
			case INT_LITERAL:
			case LONG_LITERAL:
			case FLOAT_LITERAL:
			case DOUBLE_LITERAL:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case HASH:
			case STREAM:
			case DEFINE:
			case TABLE:
			case FROM:
			case PARTITION:
			case WINDOW:
			case SELECT:
			case GROUP:
			case BY:
			case HAVING:
			case INSERT:
			case DELETE:
			case UPDATE:
			case RETURN:
			case EVENTS:
			case INTO:
			case OUTPUT:
			case EXPIRED:
			case CURRENT:
			case SNAPSHOT:
			case FOR:
			case RAW:
			case OF:
			case AS:
			case OR:
			case AND:
			case ON:
			case IS:
			case NOT:
			case WITHIN:
			case WITH:
			case BEGIN:
			case END:
			case NULL:
			case EVERY:
			case LAST:
			case ALL:
			case FIRST:
			case JOIN:
			case INNER:
			case OUTER:
			case RIGHT:
			case LEFT:
			case FULL:
			case UNIDIRECTIONAL:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case HOURS:
			case MINUTES:
			case SECONDS:
			case MILLISECONDS:
			case FALSE:
			case TRUE:
			case STRING:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case BOOL:
			case OBJECT:
			case ID_QUOTES:
			case ID:
			case STRING_LITERAL:
				{
				{
				setState(915); output_attribute();
				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(916); match(COMMA);
					setState(917); output_attribute();
					}
					}
					setState(922);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(926);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(925); group_by();
				}
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

	public static class Query_sectionContext extends ParserRuleContext {
		public HavingContext having() {
			return getRuleContext(HavingContext.class,0);
		}
		public Group_by_query_selectionContext group_by_query_selection() {
			return getRuleContext(Group_by_query_selectionContext.class,0);
		}
		public Query_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterQuery_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitQuery_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitQuery_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_sectionContext query_section() throws RecognitionException {
		Query_sectionContext _localctx = new Query_sectionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_query_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928); group_by_query_selection();
			setState(930);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(929); having();
				}
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

	public static class Group_byContext extends ParserRuleContext {
		public Attribute_referenceContext attribute_reference(int i) {
			return getRuleContext(Attribute_referenceContext.class,i);
		}
		public TerminalNode GROUP() { return getToken(SiddhiQLParser.GROUP, 0); }
		public List<Attribute_referenceContext> attribute_reference() {
			return getRuleContexts(Attribute_referenceContext.class);
		}
		public TerminalNode BY() { return getToken(SiddhiQLParser.BY, 0); }
		public Group_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterGroup_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitGroup_by(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitGroup_by(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_byContext group_by() throws RecognitionException {
		Group_byContext _localctx = new Group_byContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_group_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932); match(GROUP);
			setState(933); match(BY);
			setState(934); attribute_reference();
			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(935); match(COMMA);
				setState(936); attribute_reference();
				}
				}
				setState(941);
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

	public static class HavingContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SiddhiQLParser.HAVING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HavingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterHaving(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitHaving(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitHaving(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingContext having() throws RecognitionException {
		HavingContext _localctx = new HavingContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_having);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942); match(HAVING);
			setState(943); expression();
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

	public static class Query_outputContext extends ParserRuleContext {
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode ON() { return getToken(SiddhiQLParser.ON, 0); }
		public TerminalNode RETURN() { return getToken(SiddhiQLParser.RETURN, 0); }
		public TerminalNode UPDATE() { return getToken(SiddhiQLParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(SiddhiQLParser.DELETE, 0); }
		public TerminalNode FOR() { return getToken(SiddhiQLParser.FOR, 0); }
		public Output_event_typeContext output_event_type() {
			return getRuleContext(Output_event_typeContext.class,0);
		}
		public TerminalNode OR() { return getToken(SiddhiQLParser.OR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INSERT() { return getToken(SiddhiQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SiddhiQLParser.INTO, 0); }
		public Query_outputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterQuery_output(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitQuery_output(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitQuery_output(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_outputContext query_output() throws RecognitionException {
		Query_outputContext _localctx = new Query_outputContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_query_output);
		int _la;
		try {
			setState(985);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(945); match(INSERT);
				setState(947);
				_la = _input.LA(1);
				if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (EVENTS - 47)) | (1L << (EXPIRED - 47)) | (1L << (CURRENT - 47)) | (1L << (ALL - 47)))) != 0)) {
					{
					setState(946); output_event_type();
					}
				}

				setState(949); match(INTO);
				setState(950); target();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(951); match(DELETE);
				setState(952); target();
				setState(955);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(953); match(FOR);
					setState(954); output_event_type();
					}
				}

				setState(957); match(ON);
				setState(958); expression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(960); match(UPDATE);
				setState(961); match(OR);
				setState(962); match(INSERT);
				setState(963); match(INTO);
				setState(964); target();
				setState(967);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(965); match(FOR);
					setState(966); output_event_type();
					}
				}

				setState(969); match(ON);
				setState(970); expression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(972); match(UPDATE);
				setState(973); target();
				setState(976);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(974); match(FOR);
					setState(975); output_event_type();
					}
				}

				setState(978); match(ON);
				setState(979); expression();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(981); match(RETURN);
				setState(983);
				_la = _input.LA(1);
				if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (EVENTS - 47)) | (1L << (EXPIRED - 47)) | (1L << (CURRENT - 47)) | (1L << (ALL - 47)))) != 0)) {
					{
					setState(982); output_event_type();
					}
				}

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

	public static class Output_event_typeContext extends ParserRuleContext {
		public TerminalNode EVENTS() { return getToken(SiddhiQLParser.EVENTS, 0); }
		public TerminalNode RAW() { return getToken(SiddhiQLParser.RAW, 0); }
		public TerminalNode CURRENT() { return getToken(SiddhiQLParser.CURRENT, 0); }
		public TerminalNode EXPIRED() { return getToken(SiddhiQLParser.EXPIRED, 0); }
		public TerminalNode ALL() { return getToken(SiddhiQLParser.ALL, 0); }
		public Output_event_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_event_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterOutput_event_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitOutput_event_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitOutput_event_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_event_typeContext output_event_type() throws RecognitionException {
		Output_event_typeContext _localctx = new Output_event_typeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_output_event_type);
		int _la;
		try {
			setState(1001);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(987); match(ALL);
				setState(988); match(EVENTS);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(989); match(ALL);
				setState(990); match(RAW);
				setState(991); match(EVENTS);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(992); match(EXPIRED);
				setState(993); match(EVENTS);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(994); match(EXPIRED);
				setState(995); match(RAW);
				setState(996); match(EVENTS);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(998);
				_la = _input.LA(1);
				if (_la==CURRENT) {
					{
					setState(997); match(CURRENT);
					}
				}

				setState(1000); match(EVENTS);
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

	public static class Output_rateContext extends ParserRuleContext {
		public TerminalNode SNAPSHOT() { return getToken(SiddhiQLParser.SNAPSHOT, 0); }
		public TerminalNode EVENTS() { return getToken(SiddhiQLParser.EVENTS, 0); }
		public Time_valueContext time_value() {
			return getRuleContext(Time_valueContext.class,0);
		}
		public TerminalNode OUTPUT() { return getToken(SiddhiQLParser.OUTPUT, 0); }
		public Output_rate_typeContext output_rate_type() {
			return getRuleContext(Output_rate_typeContext.class,0);
		}
		public TerminalNode INT_LITERAL() { return getToken(SiddhiQLParser.INT_LITERAL, 0); }
		public TerminalNode EVERY() { return getToken(SiddhiQLParser.EVERY, 0); }
		public Output_rateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_rate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterOutput_rate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitOutput_rate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitOutput_rate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_rateContext output_rate() throws RecognitionException {
		Output_rateContext _localctx = new Output_rateContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_output_rate);
		int _la;
		try {
			setState(1017);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1003); match(OUTPUT);
				setState(1005);
				_la = _input.LA(1);
				if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LAST - 70)) | (1L << (ALL - 70)) | (1L << (FIRST - 70)))) != 0)) {
					{
					setState(1004); output_rate_type();
					}
				}

				setState(1007); match(EVERY);
				setState(1011);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1008); time_value();
					}
					break;

				case 2:
					{
					setState(1009); match(INT_LITERAL);
					setState(1010); match(EVENTS);
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1013); match(OUTPUT);
				setState(1014); match(SNAPSHOT);
				setState(1015); match(EVERY);
				setState(1016); time_value();
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

	public static class Output_rate_typeContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(SiddhiQLParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(SiddhiQLParser.LAST, 0); }
		public TerminalNode ALL() { return getToken(SiddhiQLParser.ALL, 0); }
		public Output_rate_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_rate_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterOutput_rate_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitOutput_rate_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitOutput_rate_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_rate_typeContext output_rate_type() throws RecognitionException {
		Output_rate_typeContext _localctx = new Output_rate_typeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_output_rate_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LAST - 70)) | (1L << (ALL - 70)) | (1L << (FIRST - 70)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Within_timeContext extends ParserRuleContext {
		public Time_valueContext time_value() {
			return getRuleContext(Time_valueContext.class,0);
		}
		public TerminalNode WITHIN() { return getToken(SiddhiQLParser.WITHIN, 0); }
		public Within_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_within_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterWithin_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitWithin_time(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitWithin_time(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Within_timeContext within_time() throws RecognitionException {
		Within_timeContext _localctx = new Within_timeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_within_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021); match(WITHIN);
			setState(1022); time_value();
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

	public static class Within_time_rangeContext extends ParserRuleContext {
		public ExpressionContext start_pattern;
		public ExpressionContext end_pattern;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode WITHIN() { return getToken(SiddhiQLParser.WITHIN, 0); }
		public Within_time_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_within_time_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterWithin_time_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitWithin_time_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitWithin_time_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Within_time_rangeContext within_time_range() throws RecognitionException {
		Within_time_rangeContext _localctx = new Within_time_rangeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_within_time_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024); match(WITHIN);
			setState(1025); ((Within_time_rangeContext)_localctx).start_pattern = expression();
			setState(1028);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1026); match(COMMA);
				setState(1027); ((Within_time_rangeContext)_localctx).end_pattern = expression();
				}
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

	public static class PerContext extends ParserRuleContext {
		public TerminalNode PER() { return getToken(SiddhiQLParser.PER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_per; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterPer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitPer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitPer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerContext per() throws RecognitionException {
		PerContext _localctx = new PerContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_per);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030); match(PER);
			setState(1031); expression();
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

	public static class Output_attributeContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public Attribute_nameContext attribute_name() {
			return getRuleContext(Attribute_nameContext.class,0);
		}
		public Attribute_referenceContext attribute_reference() {
			return getRuleContext(Attribute_referenceContext.class,0);
		}
		public TerminalNode AS() { return getToken(SiddhiQLParser.AS, 0); }
		public Output_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterOutput_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitOutput_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitOutput_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_attributeContext output_attribute() throws RecognitionException {
		Output_attributeContext _localctx = new Output_attributeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_output_attribute);
		try {
			setState(1038);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1033); attribute();
				setState(1034); match(AS);
				setState(1035); attribute_name();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1037); attribute_reference();
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

	public static class AttributeContext extends ParserRuleContext {
		public Math_operationContext math_operation() {
			return getRuleContext(Math_operationContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040); math_operation(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Math_operationContext math_operation() {
			return getRuleContext(Math_operationContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042); math_operation(0);
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

	public static class Math_operationContext extends ParserRuleContext {
		public Math_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_operation; }
	 
		public Math_operationContext() { }
		public void copyFrom(Math_operationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Multiplication_math_operationContext extends Math_operationContext {
		public Token multiply;
		public Token devide;
		public Token mod;
		public List<Math_operationContext> math_operation() {
			return getRuleContexts(Math_operationContext.class);
		}
		public Math_operationContext math_operation(int i) {
			return getRuleContext(Math_operationContext.class,i);
		}
		public Multiplication_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterMultiplication_math_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitMultiplication_math_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitMultiplication_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Greaterthan_lessthan_math_operationContext extends Math_operationContext {
		public Token gt_eq;
		public Token lt_eq;
		public Token gt;
		public Token lt;
		public List<Math_operationContext> math_operation() {
			return getRuleContexts(Math_operationContext.class);
		}
		public Math_operationContext math_operation(int i) {
			return getRuleContext(Math_operationContext.class,i);
		}
		public Greaterthan_lessthan_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterGreaterthan_lessthan_math_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitGreaterthan_lessthan_math_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitGreaterthan_lessthan_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Basic_math_operationContext extends Math_operationContext {
		public Math_operationContext math_operation() {
			return getRuleContext(Math_operationContext.class,0);
		}
		public Function_operationContext function_operation() {
			return getRuleContext(Function_operationContext.class,0);
		}
		public Attribute_referenceContext attribute_reference() {
			return getRuleContext(Attribute_referenceContext.class,0);
		}
		public Null_checkContext null_check() {
			return getRuleContext(Null_checkContext.class,0);
		}
		public Constant_valueContext constant_value() {
			return getRuleContext(Constant_valueContext.class,0);
		}
		public Basic_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterBasic_math_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitBasic_math_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitBasic_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class In_math_operationContext extends Math_operationContext {
		public Math_operationContext math_operation() {
			return getRuleContext(Math_operationContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode IN() { return getToken(SiddhiQLParser.IN, 0); }
		public In_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterIn_math_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitIn_math_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitIn_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Addition_math_operationContext extends Math_operationContext {
		public Token add;
		public Token substract;
		public List<Math_operationContext> math_operation() {
			return getRuleContexts(Math_operationContext.class);
		}
		public Math_operationContext math_operation(int i) {
			return getRuleContext(Math_operationContext.class,i);
		}
		public Addition_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterAddition_math_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitAddition_math_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAddition_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class And_math_operationContext extends Math_operationContext {
		public List<Math_operationContext> math_operation() {
			return getRuleContexts(Math_operationContext.class);
		}
		public TerminalNode AND() { return getToken(SiddhiQLParser.AND, 0); }
		public Math_operationContext math_operation(int i) {
			return getRuleContext(Math_operationContext.class,i);
		}
		public And_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterAnd_math_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitAnd_math_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAnd_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Or_math_operationContext extends Math_operationContext {
		public List<Math_operationContext> math_operation() {
			return getRuleContexts(Math_operationContext.class);
		}
		public TerminalNode OR() { return getToken(SiddhiQLParser.OR, 0); }
		public Math_operationContext math_operation(int i) {
			return getRuleContext(Math_operationContext.class,i);
		}
		public Or_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterOr_math_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitOr_math_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitOr_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Equality_math_operationContext extends Math_operationContext {
		public Token eq;
		public Token not_eq;
		public List<Math_operationContext> math_operation() {
			return getRuleContexts(Math_operationContext.class);
		}
		public Math_operationContext math_operation(int i) {
			return getRuleContext(Math_operationContext.class,i);
		}
		public Equality_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterEquality_math_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitEquality_math_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitEquality_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Not_math_operationContext extends Math_operationContext {
		public TerminalNode NOT() { return getToken(SiddhiQLParser.NOT, 0); }
		public Math_operationContext math_operation() {
			return getRuleContext(Math_operationContext.class,0);
		}
		public Not_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterNot_math_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitNot_math_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitNot_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_operationContext math_operation() throws RecognitionException {
		return math_operation(0);
	}

	private Math_operationContext math_operation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Math_operationContext _localctx = new Math_operationContext(_ctx, _parentState);
		Math_operationContext _prevctx = _localctx;
		int _startState = 148;
		enterRecursionRule(_localctx, 148, RULE_math_operation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				_localctx = new Not_math_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1045); match(NOT);
				setState(1046); math_operation(11);
				}
				break;

			case 2:
				{
				_localctx = new Basic_math_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1047); match(OPEN_PAR);
				setState(1048); math_operation(0);
				setState(1049); match(CLOSE_PAR);
				}
				break;

			case 3:
				{
				_localctx = new Basic_math_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1051); null_check();
				}
				break;

			case 4:
				{
				_localctx = new Basic_math_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1052); function_operation();
				}
				break;

			case 5:
				{
				_localctx = new Basic_math_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1053); constant_value();
				}
				break;

			case 6:
				{
				_localctx = new Basic_math_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1054); attribute_reference();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1095);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1093);
					switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplication_math_operationContext(new Math_operationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_operation);
						setState(1057);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1061);
						switch (_input.LA(1)) {
						case STAR:
							{
							setState(1058); ((Multiplication_math_operationContext)_localctx).multiply = match(STAR);
							}
							break;
						case DIV:
							{
							setState(1059); ((Multiplication_math_operationContext)_localctx).devide = match(DIV);
							}
							break;
						case MOD:
							{
							setState(1060); ((Multiplication_math_operationContext)_localctx).mod = match(MOD);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1063); math_operation(11);
						}
						break;

					case 2:
						{
						_localctx = new Addition_math_operationContext(new Math_operationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_operation);
						setState(1064);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1067);
						switch (_input.LA(1)) {
						case PLUS:
							{
							setState(1065); ((Addition_math_operationContext)_localctx).add = match(PLUS);
							}
							break;
						case MINUS:
							{
							setState(1066); ((Addition_math_operationContext)_localctx).substract = match(MINUS);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1069); math_operation(10);
						}
						break;

					case 3:
						{
						_localctx = new Greaterthan_lessthan_math_operationContext(new Math_operationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_operation);
						setState(1070);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1075);
						switch (_input.LA(1)) {
						case GT_EQ:
							{
							setState(1071); ((Greaterthan_lessthan_math_operationContext)_localctx).gt_eq = match(GT_EQ);
							}
							break;
						case LT_EQ:
							{
							setState(1072); ((Greaterthan_lessthan_math_operationContext)_localctx).lt_eq = match(LT_EQ);
							}
							break;
						case GT:
							{
							setState(1073); ((Greaterthan_lessthan_math_operationContext)_localctx).gt = match(GT);
							}
							break;
						case LT:
							{
							setState(1074); ((Greaterthan_lessthan_math_operationContext)_localctx).lt = match(LT);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1077); math_operation(9);
						}
						break;

					case 4:
						{
						_localctx = new Equality_math_operationContext(new Math_operationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_operation);
						setState(1078);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1081);
						switch (_input.LA(1)) {
						case EQ:
							{
							setState(1079); ((Equality_math_operationContext)_localctx).eq = match(EQ);
							}
							break;
						case NOT_EQ:
							{
							setState(1080); ((Equality_math_operationContext)_localctx).not_eq = match(NOT_EQ);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1083); math_operation(8);
						}
						break;

					case 5:
						{
						_localctx = new And_math_operationContext(new Math_operationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_operation);
						setState(1084);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1085); match(AND);
						setState(1086); math_operation(6);
						}
						break;

					case 6:
						{
						_localctx = new Or_math_operationContext(new Math_operationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_operation);
						setState(1087);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1088); match(OR);
						setState(1089); math_operation(5);
						}
						break;

					case 7:
						{
						_localctx = new In_math_operationContext(new Math_operationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_operation);
						setState(1090);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1091); match(IN);
						setState(1092); name();
						}
						break;
					}
					} 
				}
				setState(1097);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
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

	public static class Function_operationContext extends ParserRuleContext {
		public Function_idContext function_id() {
			return getRuleContext(Function_idContext.class,0);
		}
		public Function_namespaceContext function_namespace() {
			return getRuleContext(Function_namespaceContext.class,0);
		}
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Function_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterFunction_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitFunction_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitFunction_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_operationContext function_operation() throws RecognitionException {
		Function_operationContext _localctx = new Function_operationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_function_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1098); function_namespace();
				setState(1099); match(COL);
				}
				break;
			}
			setState(1103); function_id();
			setState(1104); match(OPEN_PAR);
			setState(1106);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << OPEN_PAR) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << HASH) | (1L << STREAM) | (1L << DEFINE) | (1L << TABLE) | (1L << FROM) | (1L << PARTITION) | (1L << WINDOW) | (1L << SELECT) | (1L << GROUP) | (1L << BY) | (1L << HAVING) | (1L << INSERT) | (1L << DELETE) | (1L << UPDATE) | (1L << RETURN) | (1L << EVENTS) | (1L << INTO) | (1L << OUTPUT) | (1L << EXPIRED) | (1L << CURRENT) | (1L << SNAPSHOT) | (1L << FOR) | (1L << RAW) | (1L << OF) | (1L << AS) | (1L << OR) | (1L << AND) | (1L << ON) | (1L << IS) | (1L << NOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WITHIN - 64)) | (1L << (WITH - 64)) | (1L << (BEGIN - 64)) | (1L << (END - 64)) | (1L << (NULL - 64)) | (1L << (EVERY - 64)) | (1L << (LAST - 64)) | (1L << (ALL - 64)) | (1L << (FIRST - 64)) | (1L << (JOIN - 64)) | (1L << (INNER - 64)) | (1L << (OUTER - 64)) | (1L << (RIGHT - 64)) | (1L << (LEFT - 64)) | (1L << (FULL - 64)) | (1L << (UNIDIRECTIONAL - 64)) | (1L << (YEARS - 64)) | (1L << (MONTHS - 64)) | (1L << (WEEKS - 64)) | (1L << (DAYS - 64)) | (1L << (HOURS - 64)) | (1L << (MINUTES - 64)) | (1L << (SECONDS - 64)) | (1L << (MILLISECONDS - 64)) | (1L << (FALSE - 64)) | (1L << (TRUE - 64)) | (1L << (STRING - 64)) | (1L << (INT - 64)) | (1L << (LONG - 64)) | (1L << (FLOAT - 64)) | (1L << (DOUBLE - 64)) | (1L << (BOOL - 64)) | (1L << (OBJECT - 64)) | (1L << (ID_QUOTES - 64)) | (1L << (ID - 64)) | (1L << (STRING_LITERAL - 64)))) != 0)) {
				{
				setState(1105); attribute_list();
				}
			}

			setState(1108); match(CLOSE_PAR);
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

	public static class Attribute_listContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Attribute_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterAttribute_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitAttribute_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAttribute_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_listContext attribute_list() throws RecognitionException {
		Attribute_listContext _localctx = new Attribute_listContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_attribute_list);
		int _la;
		try {
			setState(1119);
			switch (_input.LA(1)) {
			case INT_LITERAL:
			case LONG_LITERAL:
			case FLOAT_LITERAL:
			case DOUBLE_LITERAL:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case HASH:
			case STREAM:
			case DEFINE:
			case TABLE:
			case FROM:
			case PARTITION:
			case WINDOW:
			case SELECT:
			case GROUP:
			case BY:
			case HAVING:
			case INSERT:
			case DELETE:
			case UPDATE:
			case RETURN:
			case EVENTS:
			case INTO:
			case OUTPUT:
			case EXPIRED:
			case CURRENT:
			case SNAPSHOT:
			case FOR:
			case RAW:
			case OF:
			case AS:
			case OR:
			case AND:
			case ON:
			case IS:
			case NOT:
			case WITHIN:
			case WITH:
			case BEGIN:
			case END:
			case NULL:
			case EVERY:
			case LAST:
			case ALL:
			case FIRST:
			case JOIN:
			case INNER:
			case OUTER:
			case RIGHT:
			case LEFT:
			case FULL:
			case UNIDIRECTIONAL:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case HOURS:
			case MINUTES:
			case SECONDS:
			case MILLISECONDS:
			case FALSE:
			case TRUE:
			case STRING:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case BOOL:
			case OBJECT:
			case ID_QUOTES:
			case ID:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1110); attribute();
				setState(1115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1111); match(COMMA);
					setState(1112); attribute();
					}
					}
					setState(1117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1118); match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Null_checkContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(SiddhiQLParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SiddhiQLParser.NULL, 0); }
		public Function_operationContext function_operation() {
			return getRuleContext(Function_operationContext.class,0);
		}
		public Attribute_referenceContext attribute_reference() {
			return getRuleContext(Attribute_referenceContext.class,0);
		}
		public Stream_referenceContext stream_reference() {
			return getRuleContext(Stream_referenceContext.class,0);
		}
		public Null_checkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_check; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterNull_check(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitNull_check(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitNull_check(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_checkContext null_check() throws RecognitionException {
		Null_checkContext _localctx = new Null_checkContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_null_check);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1121); stream_reference();
				}
				break;

			case 2:
				{
				setState(1122); attribute_reference();
				}
				break;

			case 3:
				{
				setState(1123); function_operation();
				}
				break;
			}
			setState(1126); match(IS);
			setState(1127); match(NULL);
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

	public static class Stream_referenceContext extends ParserRuleContext {
		public Token hash;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Attribute_indexContext attribute_index() {
			return getRuleContext(Attribute_indexContext.class,0);
		}
		public Stream_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stream_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterStream_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitStream_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitStream_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stream_referenceContext stream_reference() throws RecognitionException {
		Stream_referenceContext _localctx = new Stream_referenceContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_stream_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(1129); ((Stream_referenceContext)_localctx).hash = match(HASH);
				}
			}

			setState(1132); name();
			setState(1137);
			_la = _input.LA(1);
			if (_la==OPEN_SQARE_BRACKETS) {
				{
				setState(1133); match(OPEN_SQARE_BRACKETS);
				setState(1134); attribute_index();
				setState(1135); match(CLOASE_SQARE_BRACKETS);
				}
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

	public static class Attribute_referenceContext extends ParserRuleContext {
		public Token hash1;
		public NameContext name1;
		public Attribute_indexContext attribute_index1;
		public Token hash2;
		public NameContext name2;
		public Attribute_indexContext attribute_index2;
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public Attribute_nameContext attribute_name() {
			return getRuleContext(Attribute_nameContext.class,0);
		}
		public List<Attribute_indexContext> attribute_index() {
			return getRuleContexts(Attribute_indexContext.class);
		}
		public Attribute_indexContext attribute_index(int i) {
			return getRuleContext(Attribute_indexContext.class,i);
		}
		public Attribute_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterAttribute_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitAttribute_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAttribute_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_referenceContext attribute_reference() throws RecognitionException {
		Attribute_referenceContext _localctx = new Attribute_referenceContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_attribute_reference);
		int _la;
		try {
			setState(1163);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1140);
				_la = _input.LA(1);
				if (_la==HASH) {
					{
					setState(1139); ((Attribute_referenceContext)_localctx).hash1 = match(HASH);
					}
				}

				setState(1142); ((Attribute_referenceContext)_localctx).name1 = name();
				setState(1147);
				_la = _input.LA(1);
				if (_la==OPEN_SQARE_BRACKETS) {
					{
					setState(1143); match(OPEN_SQARE_BRACKETS);
					setState(1144); ((Attribute_referenceContext)_localctx).attribute_index1 = attribute_index();
					setState(1145); match(CLOASE_SQARE_BRACKETS);
					}
				}

				setState(1157);
				_la = _input.LA(1);
				if (_la==HASH) {
					{
					setState(1149); ((Attribute_referenceContext)_localctx).hash2 = match(HASH);
					setState(1150); ((Attribute_referenceContext)_localctx).name2 = name();
					setState(1155);
					_la = _input.LA(1);
					if (_la==OPEN_SQARE_BRACKETS) {
						{
						setState(1151); match(OPEN_SQARE_BRACKETS);
						setState(1152); ((Attribute_referenceContext)_localctx).attribute_index2 = attribute_index();
						setState(1153); match(CLOASE_SQARE_BRACKETS);
						}
					}

					}
				}

				setState(1159); match(DOT);
				setState(1160); attribute_name();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1162); attribute_name();
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

	public static class Attribute_indexContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SiddhiQLParser.INT_LITERAL, 0); }
		public TerminalNode LAST() { return getToken(SiddhiQLParser.LAST, 0); }
		public Attribute_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterAttribute_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitAttribute_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAttribute_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_indexContext attribute_index() throws RecognitionException {
		Attribute_indexContext _localctx = new Attribute_indexContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_attribute_index);
		int _la;
		try {
			setState(1171);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1165); match(INT_LITERAL);
				}
				break;
			case LAST:
				enterOuterAlt(_localctx, 2);
				{
				setState(1166); match(LAST);
				setState(1169);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1167); match(MINUS);
					setState(1168); match(INT_LITERAL);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Function_idContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Function_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterFunction_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitFunction_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitFunction_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_idContext function_id() throws RecognitionException {
		Function_idContext _localctx = new Function_idContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_function_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173); name();
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

	public static class Function_namespaceContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Function_namespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterFunction_namespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitFunction_namespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitFunction_namespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_namespaceContext function_namespace() throws RecognitionException {
		Function_namespaceContext _localctx = new Function_namespaceContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_function_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175); name();
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

	public static class Stream_idContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Stream_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stream_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterStream_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitStream_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitStream_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stream_idContext stream_id() throws RecognitionException {
		Stream_idContext _localctx = new Stream_idContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_stream_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177); name();
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

	public static class Source_idContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Source_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterSource_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitSource_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSource_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_idContext source_id() throws RecognitionException {
		Source_idContext _localctx = new Source_idContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_source_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179); name();
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

	public static class AliasContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181); name();
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

	public static class Property_nameContext extends ParserRuleContext {
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Property_separatorContext property_separator(int i) {
			return getRuleContext(Property_separatorContext.class,i);
		}
		public List<Property_separatorContext> property_separator() {
			return getRuleContexts(Property_separatorContext.class);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public Property_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterProperty_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitProperty_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitProperty_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_nameContext property_name() throws RecognitionException {
		Property_nameContext _localctx = new Property_nameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_property_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183); name();
			setState(1189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COL) | (1L << DOT) | (1L << MINUS))) != 0)) {
				{
				{
				setState(1184); property_separator();
				setState(1185); name();
				}
				}
				setState(1191);
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

	public static class Attribute_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Attribute_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterAttribute_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitAttribute_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAttribute_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_nameContext attribute_name() throws RecognitionException {
		Attribute_nameContext _localctx = new Attribute_nameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_attribute_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192); name();
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

	public static class TypeContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194); name();
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

	public static class Property_valueContext extends ParserRuleContext {
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Property_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterProperty_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitProperty_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitProperty_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_valueContext property_value() throws RecognitionException {
		Property_valueContext _localctx = new Property_valueContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_property_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196); string_value();
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

	public static class Property_separatorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(SiddhiQLParser.DOT, 0); }
		public TerminalNode MINUS() { return getToken(SiddhiQLParser.MINUS, 0); }
		public TerminalNode COL() { return getToken(SiddhiQLParser.COL, 0); }
		public Property_separatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterProperty_separator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitProperty_separator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitProperty_separator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_separatorContext property_separator() throws RecognitionException {
		Property_separatorContext _localctx = new Property_separatorContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_property_separator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COL) | (1L << DOT) | (1L << MINUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class SourceContext extends ParserRuleContext {
		public Token inner;
		public Stream_idContext stream_id() {
			return getRuleContext(Stream_idContext.class,0);
		}
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(1200); ((SourceContext)_localctx).inner = match(HASH);
				}
			}

			setState(1203); stream_id();
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

	public static class TargetContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205); source();
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

	public static class EventContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207); name();
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

	public static class NameContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_name);
		try {
			setState(1211);
			switch (_input.LA(1)) {
			case ID_QUOTES:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1209); id();
				}
				break;
			case STREAM:
			case DEFINE:
			case TABLE:
			case FROM:
			case PARTITION:
			case WINDOW:
			case SELECT:
			case GROUP:
			case BY:
			case HAVING:
			case INSERT:
			case DELETE:
			case UPDATE:
			case RETURN:
			case EVENTS:
			case INTO:
			case OUTPUT:
			case EXPIRED:
			case CURRENT:
			case SNAPSHOT:
			case FOR:
			case RAW:
			case OF:
			case AS:
			case OR:
			case AND:
			case ON:
			case IS:
			case NOT:
			case WITHIN:
			case WITH:
			case BEGIN:
			case END:
			case NULL:
			case EVERY:
			case LAST:
			case ALL:
			case FIRST:
			case JOIN:
			case INNER:
			case OUTER:
			case RIGHT:
			case LEFT:
			case FULL:
			case UNIDIRECTIONAL:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case HOURS:
			case MINUTES:
			case SECONDS:
			case MILLISECONDS:
			case FALSE:
			case TRUE:
			case STRING:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case BOOL:
			case OBJECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1210); keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CollectContext extends ParserRuleContext {
		public Token start;
		public Token end;
		public TerminalNode INT_LITERAL(int i) {
			return getToken(SiddhiQLParser.INT_LITERAL, i);
		}
		public List<TerminalNode> INT_LITERAL() { return getTokens(SiddhiQLParser.INT_LITERAL); }
		public CollectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterCollect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitCollect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitCollect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectContext collect() throws RecognitionException {
		CollectContext _localctx = new CollectContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_collect);
		try {
			setState(1221);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1213); ((CollectContext)_localctx).start = match(INT_LITERAL);
				setState(1214); match(COL);
				setState(1215); ((CollectContext)_localctx).end = match(INT_LITERAL);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1216); ((CollectContext)_localctx).start = match(INT_LITERAL);
				setState(1217); match(COL);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1218); match(COL);
				setState(1219); ((CollectContext)_localctx).end = match(INT_LITERAL);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1220); match(INT_LITERAL);
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

	public static class Attribute_typeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(SiddhiQLParser.BOOL, 0); }
		public TerminalNode LONG() { return getToken(SiddhiQLParser.LONG, 0); }
		public TerminalNode OBJECT() { return getToken(SiddhiQLParser.OBJECT, 0); }
		public TerminalNode STRING() { return getToken(SiddhiQLParser.STRING, 0); }
		public TerminalNode INT() { return getToken(SiddhiQLParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(SiddhiQLParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(SiddhiQLParser.FLOAT, 0); }
		public Attribute_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterAttribute_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitAttribute_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAttribute_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_typeContext attribute_type() throws RecognitionException {
		Attribute_typeContext _localctx = new Attribute_typeContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_attribute_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (STRING - 90)) | (1L << (INT - 90)) | (1L << (LONG - 90)) | (1L << (FLOAT - 90)) | (1L << (DOUBLE - 90)) | (1L << (BOOL - 90)) | (1L << (OBJECT - 90)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class JoinContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(SiddhiQLParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SiddhiQLParser.OUTER, 0); }
		public TerminalNode INNER() { return getToken(SiddhiQLParser.INNER, 0); }
		public TerminalNode RIGHT() { return getToken(SiddhiQLParser.RIGHT, 0); }
		public TerminalNode JOIN() { return getToken(SiddhiQLParser.JOIN, 0); }
		public TerminalNode FULL() { return getToken(SiddhiQLParser.FULL, 0); }
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		JoinContext _localctx = new JoinContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_join);
		int _la;
		try {
			setState(1240);
			switch (_input.LA(1)) {
			case LEFT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1225); match(LEFT);
				setState(1226); match(OUTER);
				setState(1227); match(JOIN);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1228); match(RIGHT);
				setState(1229); match(OUTER);
				setState(1230); match(JOIN);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1231); match(FULL);
				setState(1232); match(OUTER);
				setState(1233); match(JOIN);
				}
				break;
			case OUTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1234); match(OUTER);
				setState(1235); match(JOIN);
				}
				break;
			case JOIN:
			case INNER:
				enterOuterAlt(_localctx, 5);
				{
				setState(1237);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1236); match(INNER);
					}
				}

				setState(1239); match(JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Constant_valueContext extends ParserRuleContext {
		public Signed_int_valueContext signed_int_value() {
			return getRuleContext(Signed_int_valueContext.class,0);
		}
		public Signed_long_valueContext signed_long_value() {
			return getRuleContext(Signed_long_valueContext.class,0);
		}
		public Time_valueContext time_value() {
			return getRuleContext(Time_valueContext.class,0);
		}
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Signed_double_valueContext signed_double_value() {
			return getRuleContext(Signed_double_valueContext.class,0);
		}
		public Bool_valueContext bool_value() {
			return getRuleContext(Bool_valueContext.class,0);
		}
		public Signed_float_valueContext signed_float_value() {
			return getRuleContext(Signed_float_valueContext.class,0);
		}
		public Constant_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterConstant_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitConstant_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitConstant_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_valueContext constant_value() throws RecognitionException {
		Constant_valueContext _localctx = new Constant_valueContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_constant_value);
		try {
			setState(1249);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1242); bool_value();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1243); signed_double_value();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1244); signed_float_value();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1245); signed_long_value();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1246); signed_int_value();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1247); time_value();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1248); string_value();
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SiddhiQLParser.ID, 0); }
		public TerminalNode ID_QUOTES() { return getToken(SiddhiQLParser.ID_QUOTES, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			_la = _input.LA(1);
			if ( !(_la==ID_QUOTES || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(SiddhiQLParser.FALSE, 0); }
		public TerminalNode PARTITION() { return getToken(SiddhiQLParser.PARTITION, 0); }
		public TerminalNode EXPIRED() { return getToken(SiddhiQLParser.EXPIRED, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SiddhiQLParser.MILLISECONDS, 0); }
		public TerminalNode FIRST() { return getToken(SiddhiQLParser.FIRST, 0); }
		public TerminalNode RIGHT() { return getToken(SiddhiQLParser.RIGHT, 0); }
		public TerminalNode RETURN() { return getToken(SiddhiQLParser.RETURN, 0); }
		public TerminalNode NULL() { return getToken(SiddhiQLParser.NULL, 0); }
		public TerminalNode EVENTS() { return getToken(SiddhiQLParser.EVENTS, 0); }
		public TerminalNode OF() { return getToken(SiddhiQLParser.OF, 0); }
		public TerminalNode BEGIN() { return getToken(SiddhiQLParser.BEGIN, 0); }
		public TerminalNode SECONDS() { return getToken(SiddhiQLParser.SECONDS, 0); }
		public TerminalNode JOIN() { return getToken(SiddhiQLParser.JOIN, 0); }
		public TerminalNode OUTER() { return getToken(SiddhiQLParser.OUTER, 0); }
		public TerminalNode FOR() { return getToken(SiddhiQLParser.FOR, 0); }
		public TerminalNode STRING() { return getToken(SiddhiQLParser.STRING, 0); }
		public TerminalNode GROUP() { return getToken(SiddhiQLParser.GROUP, 0); }
		public TerminalNode OR() { return getToken(SiddhiQLParser.OR, 0); }
		public TerminalNode TABLE() { return getToken(SiddhiQLParser.TABLE, 0); }
		public TerminalNode DOUBLE() { return getToken(SiddhiQLParser.DOUBLE, 0); }
		public TerminalNode EVERY() { return getToken(SiddhiQLParser.EVERY, 0); }
		public TerminalNode FLOAT() { return getToken(SiddhiQLParser.FLOAT, 0); }
		public TerminalNode INTO() { return getToken(SiddhiQLParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SiddhiQLParser.IS, 0); }
		public TerminalNode DAYS() { return getToken(SiddhiQLParser.DAYS, 0); }
		public TerminalNode WINDOW() { return getToken(SiddhiQLParser.WINDOW, 0); }
		public TerminalNode STREAM() { return getToken(SiddhiQLParser.STREAM, 0); }
		public TerminalNode WEEKS() { return getToken(SiddhiQLParser.WEEKS, 0); }
		public TerminalNode MONTHS() { return getToken(SiddhiQLParser.MONTHS, 0); }
		public TerminalNode DELETE() { return getToken(SiddhiQLParser.DELETE, 0); }
		public TerminalNode RAW() { return getToken(SiddhiQLParser.RAW, 0); }
		public TerminalNode OBJECT() { return getToken(SiddhiQLParser.OBJECT, 0); }
		public TerminalNode CURRENT() { return getToken(SiddhiQLParser.CURRENT, 0); }
		public TerminalNode INT() { return getToken(SiddhiQLParser.INT, 0); }
		public TerminalNode AS() { return getToken(SiddhiQLParser.AS, 0); }
		public TerminalNode WITHIN() { return getToken(SiddhiQLParser.WITHIN, 0); }
		public TerminalNode ALL() { return getToken(SiddhiQLParser.ALL, 0); }
		public TerminalNode FULL() { return getToken(SiddhiQLParser.FULL, 0); }
		public TerminalNode NOT() { return getToken(SiddhiQLParser.NOT, 0); }
		public TerminalNode OUTPUT() { return getToken(SiddhiQLParser.OUTPUT, 0); }
		public TerminalNode AND() { return getToken(SiddhiQLParser.AND, 0); }
		public TerminalNode HAVING() { return getToken(SiddhiQLParser.HAVING, 0); }
		public TerminalNode BY() { return getToken(SiddhiQLParser.BY, 0); }
		public TerminalNode INSERT() { return getToken(SiddhiQLParser.INSERT, 0); }
		public TerminalNode MINUTES() { return getToken(SiddhiQLParser.MINUTES, 0); }
		public TerminalNode SNAPSHOT() { return getToken(SiddhiQLParser.SNAPSHOT, 0); }
		public TerminalNode LEFT() { return getToken(SiddhiQLParser.LEFT, 0); }
		public TerminalNode ON() { return getToken(SiddhiQLParser.ON, 0); }
		public TerminalNode WITH() { return getToken(SiddhiQLParser.WITH, 0); }
		public TerminalNode BOOL() { return getToken(SiddhiQLParser.BOOL, 0); }
		public TerminalNode UNIDIRECTIONAL() { return getToken(SiddhiQLParser.UNIDIRECTIONAL, 0); }
		public TerminalNode TRUE() { return getToken(SiddhiQLParser.TRUE, 0); }
		public TerminalNode HOURS() { return getToken(SiddhiQLParser.HOURS, 0); }
		public TerminalNode FROM() { return getToken(SiddhiQLParser.FROM, 0); }
		public TerminalNode LAST() { return getToken(SiddhiQLParser.LAST, 0); }
		public TerminalNode DEFINE() { return getToken(SiddhiQLParser.DEFINE, 0); }
		public TerminalNode UPDATE() { return getToken(SiddhiQLParser.UPDATE, 0); }
		public TerminalNode LONG() { return getToken(SiddhiQLParser.LONG, 0); }
		public TerminalNode INNER() { return getToken(SiddhiQLParser.INNER, 0); }
		public TerminalNode END() { return getToken(SiddhiQLParser.END, 0); }
		public TerminalNode YEARS() { return getToken(SiddhiQLParser.YEARS, 0); }
		public TerminalNode SELECT() { return getToken(SiddhiQLParser.SELECT, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STREAM) | (1L << DEFINE) | (1L << TABLE) | (1L << FROM) | (1L << PARTITION) | (1L << WINDOW) | (1L << SELECT) | (1L << GROUP) | (1L << BY) | (1L << HAVING) | (1L << INSERT) | (1L << DELETE) | (1L << UPDATE) | (1L << RETURN) | (1L << EVENTS) | (1L << INTO) | (1L << OUTPUT) | (1L << EXPIRED) | (1L << CURRENT) | (1L << SNAPSHOT) | (1L << FOR) | (1L << RAW) | (1L << OF) | (1L << AS) | (1L << OR) | (1L << AND) | (1L << ON) | (1L << IS) | (1L << NOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WITHIN - 64)) | (1L << (WITH - 64)) | (1L << (BEGIN - 64)) | (1L << (END - 64)) | (1L << (NULL - 64)) | (1L << (EVERY - 64)) | (1L << (LAST - 64)) | (1L << (ALL - 64)) | (1L << (FIRST - 64)) | (1L << (JOIN - 64)) | (1L << (INNER - 64)) | (1L << (OUTER - 64)) | (1L << (RIGHT - 64)) | (1L << (LEFT - 64)) | (1L << (FULL - 64)) | (1L << (UNIDIRECTIONAL - 64)) | (1L << (YEARS - 64)) | (1L << (MONTHS - 64)) | (1L << (WEEKS - 64)) | (1L << (DAYS - 64)) | (1L << (HOURS - 64)) | (1L << (MINUTES - 64)) | (1L << (SECONDS - 64)) | (1L << (MILLISECONDS - 64)) | (1L << (FALSE - 64)) | (1L << (TRUE - 64)) | (1L << (STRING - 64)) | (1L << (INT - 64)) | (1L << (LONG - 64)) | (1L << (FLOAT - 64)) | (1L << (DOUBLE - 64)) | (1L << (BOOL - 64)) | (1L << (OBJECT - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Time_valueContext extends ParserRuleContext {
		public Week_valueContext week_value() {
			return getRuleContext(Week_valueContext.class,0);
		}
		public Month_valueContext month_value() {
			return getRuleContext(Month_valueContext.class,0);
		}
		public Day_valueContext day_value() {
			return getRuleContext(Day_valueContext.class,0);
		}
		public Year_valueContext year_value() {
			return getRuleContext(Year_valueContext.class,0);
		}
		public Minute_valueContext minute_value() {
			return getRuleContext(Minute_valueContext.class,0);
		}
		public Hour_valueContext hour_value() {
			return getRuleContext(Hour_valueContext.class,0);
		}
		public Millisecond_valueContext millisecond_value() {
			return getRuleContext(Millisecond_valueContext.class,0);
		}
		public Second_valueContext second_value() {
			return getRuleContext(Second_valueContext.class,0);
		}
		public Time_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterTime_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitTime_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitTime_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_valueContext time_value() throws RecognitionException {
		Time_valueContext _localctx = new Time_valueContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_time_value);
		try {
			setState(1347);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1255); year_value();
				setState(1257);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1256); month_value();
					}
					break;
				}
				setState(1260);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1259); week_value();
					}
					break;
				}
				setState(1263);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1262); day_value();
					}
					break;
				}
				setState(1266);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1265); hour_value();
					}
					break;
				}
				setState(1269);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1268); minute_value();
					}
					break;
				}
				setState(1272);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1271); second_value();
					}
					break;
				}
				setState(1275);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1274); millisecond_value();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1277); month_value();
				setState(1279);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1278); week_value();
					}
					break;
				}
				setState(1282);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1281); day_value();
					}
					break;
				}
				setState(1285);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1284); hour_value();
					}
					break;
				}
				setState(1288);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1287); minute_value();
					}
					break;
				}
				setState(1291);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1290); second_value();
					}
					break;
				}
				setState(1294);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1293); millisecond_value();
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1296); week_value();
				setState(1298);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1297); day_value();
					}
					break;
				}
				setState(1301);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1300); hour_value();
					}
					break;
				}
				setState(1304);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1303); minute_value();
					}
					break;
				}
				setState(1307);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1306); second_value();
					}
					break;
				}
				setState(1310);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1309); millisecond_value();
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1312); day_value();
				setState(1314);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1313); hour_value();
					}
					break;
				}
				setState(1317);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1316); minute_value();
					}
					break;
				}
				setState(1320);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1319); second_value();
					}
					break;
				}
				setState(1323);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1322); millisecond_value();
					}
					break;
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1325); hour_value();
				setState(1327);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1326); minute_value();
					}
					break;
				}
				setState(1330);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1329); second_value();
					}
					break;
				}
				setState(1333);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1332); millisecond_value();
					}
					break;
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1335); minute_value();
				setState(1337);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1336); second_value();
					}
					break;
				}
				setState(1340);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1339); millisecond_value();
					}
					break;
				}
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1342); second_value();
				setState(1344);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1343); millisecond_value();
					}
					break;
				}
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1346); millisecond_value();
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

	public static class Year_valueContext extends ParserRuleContext {
		public TerminalNode YEARS() { return getToken(SiddhiQLParser.YEARS, 0); }
		public TerminalNode INT_LITERAL() { return getToken(SiddhiQLParser.INT_LITERAL, 0); }
		public Year_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterYear_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitYear_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitYear_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Year_valueContext year_value() throws RecognitionException {
		Year_valueContext _localctx = new Year_valueContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_year_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349); match(INT_LITERAL);
			setState(1350); match(YEARS);
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

	public static class Month_valueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SiddhiQLParser.INT_LITERAL, 0); }
		public TerminalNode MONTHS() { return getToken(SiddhiQLParser.MONTHS, 0); }
		public Month_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterMonth_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitMonth_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitMonth_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Month_valueContext month_value() throws RecognitionException {
		Month_valueContext _localctx = new Month_valueContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_month_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352); match(INT_LITERAL);
			setState(1353); match(MONTHS);
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

	public static class Week_valueContext extends ParserRuleContext {
		public TerminalNode WEEKS() { return getToken(SiddhiQLParser.WEEKS, 0); }
		public TerminalNode INT_LITERAL() { return getToken(SiddhiQLParser.INT_LITERAL, 0); }
		public Week_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_week_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterWeek_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitWeek_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitWeek_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Week_valueContext week_value() throws RecognitionException {
		Week_valueContext _localctx = new Week_valueContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_week_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355); match(INT_LITERAL);
			setState(1356); match(WEEKS);
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

	public static class Day_valueContext extends ParserRuleContext {
		public TerminalNode DAYS() { return getToken(SiddhiQLParser.DAYS, 0); }
		public TerminalNode INT_LITERAL() { return getToken(SiddhiQLParser.INT_LITERAL, 0); }
		public Day_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterDay_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitDay_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDay_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Day_valueContext day_value() throws RecognitionException {
		Day_valueContext _localctx = new Day_valueContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_day_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358); match(INT_LITERAL);
			setState(1359); match(DAYS);
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

	public static class Hour_valueContext extends ParserRuleContext {
		public TerminalNode HOURS() { return getToken(SiddhiQLParser.HOURS, 0); }
		public TerminalNode INT_LITERAL() { return getToken(SiddhiQLParser.INT_LITERAL, 0); }
		public Hour_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hour_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterHour_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitHour_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitHour_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hour_valueContext hour_value() throws RecognitionException {
		Hour_valueContext _localctx = new Hour_valueContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_hour_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1361); match(INT_LITERAL);
			setState(1362); match(HOURS);
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

	public static class Minute_valueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SiddhiQLParser.INT_LITERAL, 0); }
		public TerminalNode MINUTES() { return getToken(SiddhiQLParser.MINUTES, 0); }
		public Minute_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minute_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterMinute_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitMinute_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitMinute_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Minute_valueContext minute_value() throws RecognitionException {
		Minute_valueContext _localctx = new Minute_valueContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_minute_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364); match(INT_LITERAL);
			setState(1365); match(MINUTES);
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

	public static class Second_valueContext extends ParserRuleContext {
		public TerminalNode SECONDS() { return getToken(SiddhiQLParser.SECONDS, 0); }
		public TerminalNode INT_LITERAL() { return getToken(SiddhiQLParser.INT_LITERAL, 0); }
		public Second_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_second_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterSecond_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitSecond_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSecond_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Second_valueContext second_value() throws RecognitionException {
		Second_valueContext _localctx = new Second_valueContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_second_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367); match(INT_LITERAL);
			setState(1368); match(SECONDS);
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

	public static class Millisecond_valueContext extends ParserRuleContext {
		public TerminalNode MILLISECONDS() { return getToken(SiddhiQLParser.MILLISECONDS, 0); }
		public TerminalNode INT_LITERAL() { return getToken(SiddhiQLParser.INT_LITERAL, 0); }
		public Millisecond_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_millisecond_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterMillisecond_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitMillisecond_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitMillisecond_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Millisecond_valueContext millisecond_value() throws RecognitionException {
		Millisecond_valueContext _localctx = new Millisecond_valueContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_millisecond_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1370); match(INT_LITERAL);
			setState(1371); match(MILLISECONDS);
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

	public static class Signed_double_valueContext extends ParserRuleContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SiddhiQLParser.DOUBLE_LITERAL, 0); }
		public Signed_double_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_double_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterSigned_double_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitSigned_double_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSigned_double_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_double_valueContext signed_double_value() throws RecognitionException {
		Signed_double_valueContext _localctx = new Signed_double_valueContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_signed_double_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1373);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1376); match(DOUBLE_LITERAL);
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

	public static class Signed_long_valueContext extends ParserRuleContext {
		public TerminalNode LONG_LITERAL() { return getToken(SiddhiQLParser.LONG_LITERAL, 0); }
		public Signed_long_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_long_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterSigned_long_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitSigned_long_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSigned_long_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_long_valueContext signed_long_value() throws RecognitionException {
		Signed_long_valueContext _localctx = new Signed_long_valueContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_signed_long_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1378);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1381); match(LONG_LITERAL);
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

	public static class Signed_float_valueContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(SiddhiQLParser.FLOAT_LITERAL, 0); }
		public Signed_float_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_float_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterSigned_float_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitSigned_float_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSigned_float_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_float_valueContext signed_float_value() throws RecognitionException {
		Signed_float_valueContext _localctx = new Signed_float_valueContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_signed_float_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1383);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1386); match(FLOAT_LITERAL);
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

	public static class Signed_int_valueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SiddhiQLParser.INT_LITERAL, 0); }
		public Signed_int_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_int_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterSigned_int_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitSigned_int_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSigned_int_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_int_valueContext signed_int_value() throws RecognitionException {
		Signed_int_valueContext _localctx = new Signed_int_valueContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_signed_int_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1389);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1388);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1391); match(INT_LITERAL);
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

	public static class Bool_valueContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(SiddhiQLParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(SiddhiQLParser.TRUE, 0); }
		public Bool_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterBool_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitBool_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitBool_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_valueContext bool_value() throws RecognitionException {
		Bool_valueContext _localctx = new Bool_valueContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_bool_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class String_valueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SiddhiQLParser.STRING_LITERAL, 0); }
		public String_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).enterString_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SiddhiQLListener ) ((SiddhiQLListener)listener).exitString_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitString_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_valueContext string_value() throws RecognitionException {
		String_valueContext _localctx = new String_valueContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_string_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1395); match(STRING_LITERAL);
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
		case 43: return every_pattern_source_chain_sempred((Every_pattern_source_chainContext)_localctx, predIndex);

		case 44: return pattern_source_chain_sempred((Pattern_source_chainContext)_localctx, predIndex);

		case 53: return sequence_source_chain_sempred((Sequence_source_chainContext)_localctx, predIndex);

		case 74: return math_operation_sempred((Math_operationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean sequence_source_chain_sempred(Sequence_source_chainContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean pattern_source_chain_sempred(Pattern_source_chainContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean every_pattern_source_chain_sempred(Every_pattern_source_chainContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean math_operation_sempred(Math_operationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 10);

		case 4: return precpred(_ctx, 9);

		case 5: return precpred(_ctx, 8);

		case 6: return precpred(_ctx, 7);

		case 7: return precpred(_ctx, 5);

		case 8: return precpred(_ctx, 4);

		case 9: return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3m\u0578\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\3\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\7\4\u00f2\n\4\f\4\16\4\u00f5\13\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4\u00fe\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0108\n"+
		"\4\7\4\u010a\n\4\f\4\16\4\u010d\13\4\3\4\5\4\u0110\n\4\3\4\3\4\3\4\5\4"+
		"\u0115\n\4\3\4\3\4\3\4\5\4\u011a\n\4\7\4\u011c\n\4\f\4\16\4\u011f\13\4"+
		"\3\4\5\4\u0122\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u012c\n\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0136\n\4\7\4\u0138\n\4\f\4\16\4\u013b"+
		"\13\4\3\4\3\4\3\4\5\4\u0140\n\4\7\4\u0142\n\4\f\4\16\4\u0145\13\4\3\4"+
		"\5\4\u0148\n\4\5\4\u014a\n\4\3\5\3\5\5\5\u014e\n\5\3\6\3\6\5\6\u0152\n"+
		"\6\3\6\3\6\3\7\7\7\u0157\n\7\f\7\16\7\u015a\13\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7\u0166\n\7\f\7\16\7\u0169\13\7\3\7\3\7\3\b\3\b\5"+
		"\b\u016f\n\b\3\b\3\b\3\t\7\t\u0174\n\t\f\t\16\t\u0177\13\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0183\n\t\f\t\16\t\u0186\13\t\3\t\3\t"+
		"\3\n\3\n\5\n\u018c\n\n\3\n\3\n\3\13\7\13\u0191\n\13\f\13\16\13\u0194\13"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u01a0\n\13"+
		"\f\13\16\13\u01a3\13\13\3\13\3\13\3\13\3\13\5\13\u01a9\n\13\3\f\3\f\5"+
		"\f\u01ad\n\f\3\f\3\f\3\r\3\r\3\r\5\r\u01b4\n\r\3\16\3\16\3\16\5\16\u01b9"+
		"\n\16\3\16\3\16\5\16\u01bd\n\16\3\16\3\16\3\16\5\16\u01c2\n\16\3\17\3"+
		"\17\5\17\u01c6\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u01dc\n\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01e7\n\25\3\26\3\26\3\27"+
		"\3\27\5\27\u01ed\n\27\3\27\3\27\3\30\7\30\u01f2\n\30\f\30\16\30\u01f5"+
		"\13\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0200\n\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\32\3\32\5\32\u0209\n\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\7\35\u0214\n\35\f\35\16\35\u0217\13\35\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u021e\n\36\3\36\3\36\3\36\5\36\u0223\n\36\7"+
		"\36\u0225\n\36\f\36\16\36\u0228\13\36\3\36\3\36\5\36\u022c\n\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0236\n\37\f\37\16\37\u0239\13"+
		"\37\3\37\3\37\5\37\u023d\n\37\3 \3 \3 \5 \u0242\n \3 \3 \3!\7!\u0247\n"+
		"!\f!\16!\u024a\13!\3!\3!\3!\3!\3!\3!\7!\u0252\n!\f!\16!\u0255\13!\3!\3"+
		"!\3!\3!\5!\u025b\n!\3!\3!\3!\5!\u0260\n!\7!\u0262\n!\f!\16!\u0265\13!"+
		"\3!\5!\u0268\n!\3!\3!\3\"\3\"\5\"\u026e\n\"\3\"\3\"\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\5#\u027a\n#\3$\3$\3$\7$\u027f\n$\f$\16$\u0282\13$\3%\3%\3%\3%\3"+
		"&\3&\5&\u028a\n&\3&\3&\3\'\7\'\u028f\n\'\f\'\16\'\u0292\13\'\3\'\3\'\3"+
		"\'\5\'\u0297\n\'\3\'\5\'\u029a\n\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u02a3\n("+
		"\3)\3)\5)\u02a7\n)\3)\5)\u02aa\n)\3)\5)\u02ad\n)\3*\3*\3*\3*\3*\3*\5*"+
		"\u02b5\n*\3*\3*\3*\5*\u02ba\n*\3*\3*\3*\3*\3*\5*\u02c1\n*\3*\3*\3*\5*"+
		"\u02c6\n*\3*\3*\3*\3*\3*\3*\5*\u02ce\n*\3*\3*\3*\5*\u02d3\n*\5*\u02d5"+
		"\n*\3+\3+\5+\u02d9\n+\3+\5+\u02dc\n+\3+\3+\5+\u02e0\n+\3,\3,\3-\3-\3-"+
		"\3-\3-\5-\u02e9\n-\3-\3-\3-\3-\3-\5-\u02f0\n-\3-\3-\3-\3-\5-\u02f6\n-"+
		"\5-\u02f8\n-\3-\3-\3-\7-\u02fd\n-\f-\16-\u0300\13-\3.\3.\3.\3.\3.\5.\u0307"+
		"\n.\3.\3.\5.\u030b\n.\5.\u030d\n.\3.\3.\3.\7.\u0312\n.\f.\16.\u0315\13"+
		".\3/\3/\3/\5/\u031a\n/\3\60\3\60\3\60\3\60\5\60\u0320\n\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\5\60\u032a\n\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\5\62\u0334\n\62\3\62\3\62\3\63\3\63\5\63\u033a\n\63\3"+
		"\64\6\64\u033d\n\64\r\64\16\64\u033e\3\65\3\65\5\65\u0343\n\65\3\66\5"+
		"\66\u0346\n\66\3\66\3\66\5\66\u034a\n\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u0354\n\67\3\67\3\67\5\67\u0358\n\67\5\67\u035a\n\67\3"+
		"\67\3\67\3\67\7\67\u035f\n\67\f\67\16\67\u0362\13\67\38\38\38\58\u0367"+
		"\n8\39\39\39\39\39\39\39\39\59\u0371\n9\3:\3:\3:\3:\3:\3:\3:\5:\u037a"+
		"\n:\3:\5:\u037d\n:\3:\3:\5:\u0381\n:\5:\u0383\n:\3;\5;\u0386\n;\3;\3;"+
		"\3;\3;\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\7>\u0399\n>\f>\16>\u039c"+
		"\13>\5>\u039e\n>\3>\5>\u03a1\n>\3?\3?\5?\u03a5\n?\3@\3@\3@\3@\3@\7@\u03ac"+
		"\n@\f@\16@\u03af\13@\3A\3A\3A\3B\3B\5B\u03b6\nB\3B\3B\3B\3B\3B\3B\5B\u03be"+
		"\nB\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u03ca\nB\3B\3B\3B\3B\3B\3B\3B\5B"+
		"\u03d3\nB\3B\3B\3B\3B\3B\5B\u03da\nB\5B\u03dc\nB\3C\3C\3C\3C\3C\3C\3C"+
		"\3C\3C\3C\3C\5C\u03e9\nC\3C\5C\u03ec\nC\3D\3D\5D\u03f0\nD\3D\3D\3D\3D"+
		"\5D\u03f6\nD\3D\3D\3D\3D\5D\u03fc\nD\3E\3E\3F\3F\3F\3G\3G\3G\3G\5G\u0407"+
		"\nG\3H\3H\3H\3I\3I\3I\3I\3I\5I\u0411\nI\3J\3J\3K\3K\3L\3L\3L\3L\3L\3L"+
		"\3L\3L\3L\3L\3L\5L\u0422\nL\3L\3L\3L\3L\5L\u0428\nL\3L\3L\3L\3L\5L\u042e"+
		"\nL\3L\3L\3L\3L\3L\3L\5L\u0436\nL\3L\3L\3L\3L\5L\u043c\nL\3L\3L\3L\3L"+
		"\3L\3L\3L\3L\3L\3L\7L\u0448\nL\fL\16L\u044b\13L\3M\3M\3M\5M\u0450\nM\3"+
		"M\3M\3M\5M\u0455\nM\3M\3M\3N\3N\3N\7N\u045c\nN\fN\16N\u045f\13N\3N\5N"+
		"\u0462\nN\3O\3O\3O\5O\u0467\nO\3O\3O\3O\3P\5P\u046d\nP\3P\3P\3P\3P\3P"+
		"\5P\u0474\nP\3Q\5Q\u0477\nQ\3Q\3Q\3Q\3Q\3Q\5Q\u047e\nQ\3Q\3Q\3Q\3Q\3Q"+
		"\3Q\5Q\u0486\nQ\5Q\u0488\nQ\3Q\3Q\3Q\3Q\5Q\u048e\nQ\3R\3R\3R\3R\5R\u0494"+
		"\nR\5R\u0496\nR\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3X\3X\7X\u04a6\nX"+
		"\fX\16X\u04a9\13X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\5]\u04b4\n]\3]\3]\3^\3"+
		"^\3_\3_\3`\3`\5`\u04be\n`\3a\3a\3a\3a\3a\3a\3a\3a\5a\u04c8\na\3b\3b\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u04d8\nc\3c\5c\u04db\nc\3d\3d\3"+
		"d\3d\3d\3d\3d\5d\u04e4\nd\3e\3e\3f\3f\3g\3g\5g\u04ec\ng\3g\5g\u04ef\n"+
		"g\3g\5g\u04f2\ng\3g\5g\u04f5\ng\3g\5g\u04f8\ng\3g\5g\u04fb\ng\3g\5g\u04fe"+
		"\ng\3g\3g\5g\u0502\ng\3g\5g\u0505\ng\3g\5g\u0508\ng\3g\5g\u050b\ng\3g"+
		"\5g\u050e\ng\3g\5g\u0511\ng\3g\3g\5g\u0515\ng\3g\5g\u0518\ng\3g\5g\u051b"+
		"\ng\3g\5g\u051e\ng\3g\5g\u0521\ng\3g\3g\5g\u0525\ng\3g\5g\u0528\ng\3g"+
		"\5g\u052b\ng\3g\5g\u052e\ng\3g\3g\5g\u0532\ng\3g\5g\u0535\ng\3g\5g\u0538"+
		"\ng\3g\3g\5g\u053c\ng\3g\5g\u053f\ng\3g\3g\5g\u0543\ng\3g\5g\u0546\ng"+
		"\3h\3h\3h\3i\3i\3i\3j\3j\3j\3k\3k\3k\3l\3l\3l\3m\3m\3m\3n\3n\3n\3o\3o"+
		"\3o\3p\5p\u0561\np\3p\3p\3q\5q\u0566\nq\3q\3q\3r\5r\u056b\nr\3r\3r\3s"+
		"\5s\u0570\ns\3s\3s\3t\3t\3u\3u\3u\2\6XZl\u0096v\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\2\n\3\2RX\3\2HJ\5\2\7\7\t\t\24\24"+
		"\3\2\\b\3\2fg\7\2 !$$&:<=?b\4\2\22\22\24\24\3\2Z[\u05ff\2\u00ea\3\2\2"+
		"\2\4\u00ed\3\2\2\2\6\u00f3\3\2\2\2\b\u014d\3\2\2\2\n\u014f\3\2\2\2\f\u0158"+
		"\3\2\2\2\16\u016c\3\2\2\2\20\u0175\3\2\2\2\22\u0189\3\2\2\2\24\u0192\3"+
		"\2\2\2\26\u01aa\3\2\2\2\30\u01b0\3\2\2\2\32\u01b5\3\2\2\2\34\u01c3\3\2"+
		"\2\2\36\u01c9\3\2\2\2 \u01d3\3\2\2\2\"\u01d5\3\2\2\2$\u01d7\3\2\2\2&\u01d9"+
		"\3\2\2\2(\u01df\3\2\2\2*\u01e8\3\2\2\2,\u01ea\3\2\2\2.\u01f3\3\2\2\2\60"+
		"\u0204\3\2\2\2\62\u0208\3\2\2\2\64\u020a\3\2\2\2\66\u020c\3\2\2\28\u0210"+
		"\3\2\2\2:\u0218\3\2\2\2<\u022d\3\2\2\2>\u0241\3\2\2\2@\u0248\3\2\2\2B"+
		"\u026b\3\2\2\2D\u0279\3\2\2\2F\u027b\3\2\2\2H\u0283\3\2\2\2J\u0287\3\2"+
		"\2\2L\u0290\3\2\2\2N\u02a2\3\2\2\2P\u02a4\3\2\2\2R\u02d4\3\2\2\2T\u02d6"+
		"\3\2\2\2V\u02e1\3\2\2\2X\u02f7\3\2\2\2Z\u030c\3\2\2\2\\\u0319\3\2\2\2"+
		"^\u0329\3\2\2\2`\u032b\3\2\2\2b\u0333\3\2\2\2d\u0337\3\2\2\2f\u033c\3"+
		"\2\2\2h\u0342\3\2\2\2j\u0345\3\2\2\2l\u0359\3\2\2\2n\u0366\3\2\2\2p\u0368"+
		"\3\2\2\2r\u0382\3\2\2\2t\u0385\3\2\2\2v\u038b\3\2\2\2x\u038e\3\2\2\2z"+
		"\u0393\3\2\2\2|\u03a2\3\2\2\2~\u03a6\3\2\2\2\u0080\u03b0\3\2\2\2\u0082"+
		"\u03db\3\2\2\2\u0084\u03eb\3\2\2\2\u0086\u03fb\3\2\2\2\u0088\u03fd\3\2"+
		"\2\2\u008a\u03ff\3\2\2\2\u008c\u0402\3\2\2\2\u008e\u0408\3\2\2\2\u0090"+
		"\u0410\3\2\2\2\u0092\u0412\3\2\2\2\u0094\u0414\3\2\2\2\u0096\u0421\3\2"+
		"\2\2\u0098\u044f\3\2\2\2\u009a\u0461\3\2\2\2\u009c\u0466\3\2\2\2\u009e"+
		"\u046c\3\2\2\2\u00a0\u048d\3\2\2\2\u00a2\u0495\3\2\2\2\u00a4\u0497\3\2"+
		"\2\2\u00a6\u0499\3\2\2\2\u00a8\u049b\3\2\2\2\u00aa\u049d\3\2\2\2\u00ac"+
		"\u049f\3\2\2\2\u00ae\u04a1\3\2\2\2\u00b0\u04aa\3\2\2\2\u00b2\u04ac\3\2"+
		"\2\2\u00b4\u04ae\3\2\2\2\u00b6\u04b0\3\2\2\2\u00b8\u04b3\3\2\2\2\u00ba"+
		"\u04b7\3\2\2\2\u00bc\u04b9\3\2\2\2\u00be\u04bd\3\2\2\2\u00c0\u04c7\3\2"+
		"\2\2\u00c2\u04c9\3\2\2\2\u00c4\u04da\3\2\2\2\u00c6\u04e3\3\2\2\2\u00c8"+
		"\u04e5\3\2\2\2\u00ca\u04e7\3\2\2\2\u00cc\u0545\3\2\2\2\u00ce\u0547\3\2"+
		"\2\2\u00d0\u054a\3\2\2\2\u00d2\u054d\3\2\2\2\u00d4\u0550\3\2\2\2\u00d6"+
		"\u0553\3\2\2\2\u00d8\u0556\3\2\2\2\u00da\u0559\3\2\2\2\u00dc\u055c\3\2"+
		"\2\2\u00de\u0560\3\2\2\2\u00e0\u0565\3\2\2\2\u00e2\u056a\3\2\2\2\u00e4"+
		"\u056f\3\2\2\2\u00e6\u0573\3\2\2\2\u00e8\u0575\3\2\2\2\u00ea\u00eb\5\6"+
		"\4\2\u00eb\u00ec\7\2\2\3\u00ec\3\3\2\2\2\u00ed\u00ee\7l\2\2\u00ee\5\3"+
		"\2\2\2\u00ef\u00f2\5<\37\2\u00f0\u00f2\5\4\3\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u0149\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00fe\5\f\7\2\u00f7"+
		"\u00fe\5\20\t\2\u00f8\u00fe\5(\25\2\u00f9\u00fe\5\36\20\2\u00fa\u00fe"+
		"\5\24\13\2\u00fb\u00fe\5.\30\2\u00fc\u00fe\5\4\3\2\u00fd\u00f6\3\2\2\2"+
		"\u00fd\u00f7\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fa"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u010b\3\2\2\2\u00ff"+
		"\u0107\7\b\2\2\u0100\u0108\5\f\7\2\u0101\u0108\5\20\t\2\u0102\u0108\5"+
		"(\25\2\u0103\u0108\5\36\20\2\u0104\u0108\5\24\13\2\u0105\u0108\5.\30\2"+
		"\u0106\u0108\5\4\3\2\u0107\u0100\3\2\2\2\u0107\u0101\3\2\2\2\u0107\u0102"+
		"\3\2\2\2\u0107\u0103\3\2\2\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0106\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u00ff\3\2\2\2\u010a\u010d\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u0110\7\b\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u014a\3\2\2\2\u0111\u014a\3\2\2\2\u0112\u0115\5\b\5\2\u0113"+
		"\u0115\5\4\3\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\u011d\3\2"+
		"\2\2\u0116\u0119\7\b\2\2\u0117\u011a\5\b\5\2\u0118\u011a\5\4\3\2\u0119"+
		"\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0116\3\2"+
		"\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122\7\b\2\2\u0121\u0120\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122\u014a\3\2\2\2\u0123\u014a\3\2\2\2\u0124"+
		"\u012c\5\f\7\2\u0125\u012c\5\20\t\2\u0126\u012c\5(\25\2\u0127\u012c\5"+
		"\36\20\2\u0128\u012c\5\24\13\2\u0129\u012c\5.\30\2\u012a\u012c\5\4\3\2"+
		"\u012b\u0124\3\2\2\2\u012b\u0125\3\2\2\2\u012b\u0126\3\2\2\2\u012b\u0127"+
		"\3\2\2\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c"+
		"\u0139\3\2\2\2\u012d\u0135\7\b\2\2\u012e\u0136\5\f\7\2\u012f\u0136\5\20"+
		"\t\2\u0130\u0136\5(\25\2\u0131\u0136\5\36\20\2\u0132\u0136\5\24\13\2\u0133"+
		"\u0136\5.\30\2\u0134\u0136\5\4\3\2\u0135\u012e\3\2\2\2\u0135\u012f\3\2"+
		"\2\2\u0135\u0130\3\2\2\2\u0135\u0131\3\2\2\2\u0135\u0132\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u012d\3\2"+
		"\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u0143\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013f\7\b\2\2\u013d\u0140\5\b"+
		"\5\2\u013e\u0140\5\4\3\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140"+
		"\u0142\3\2\2\2\u0141\u013c\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u0148\7\b\2\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2"+
		"\2\2\u0149\u00fd\3\2\2\2\u0149\u0111\3\2\2\2\u0149\u0114\3\2\2\2\u0149"+
		"\u0123\3\2\2\2\u0149\u012b\3\2\2\2\u014a\7\3\2\2\2\u014b\u014e\5L\'\2"+
		"\u014c\u014e\5@!\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e\t\3\2"+
		"\2\2\u014f\u0151\5\f\7\2\u0150\u0152\7\b\2\2\u0151\u0150\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\7\2\2\3\u0154\13\3\2\2"+
		"\2\u0155\u0157\5:\36\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b"+
		"\u015c\7!\2\2\u015c\u015d\7 \2\2\u015d\u015e\5\u00b8]\2\u015e\u015f\7"+
		"\13\2\2\u015f\u0160\5\u00b0Y\2\u0160\u0167\5\u00c2b\2\u0161\u0162\7\17"+
		"\2\2\u0162\u0163\5\u00b0Y\2\u0163\u0164\5\u00c2b\2\u0164\u0166\3\2\2\2"+
		"\u0165\u0161\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168"+
		"\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\7\f\2\2\u016b"+
		"\r\3\2\2\2\u016c\u016e\5\20\t\2\u016d\u016f\7\b\2\2\u016e\u016d\3\2\2"+
		"\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\7\2\2\3\u0171\17"+
		"\3\2\2\2\u0172\u0174\5:\36\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2"+
		"\2\2\u0178\u0179\7!\2\2\u0179\u017a\7$\2\2\u017a\u017b\5\u00b8]\2\u017b"+
		"\u017c\7\13\2\2\u017c\u017d\5\u00b0Y\2\u017d\u0184\5\u00c2b\2\u017e\u017f"+
		"\7\17\2\2\u017f\u0180\5\u00b0Y\2\u0180\u0181\5\u00c2b\2\u0181\u0183\3"+
		"\2\2\2\u0182\u017e\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188\7\f"+
		"\2\2\u0188\21\3\2\2\2\u0189\u018b\5\24\13\2\u018a\u018c\7\b\2\2\u018b"+
		"\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\7\2"+
		"\2\3\u018e\23\3\2\2\2\u018f\u0191\5:\36\2\u0190\u018f\3\2\2\2\u0191\u0194"+
		"\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0195\u0196\7!\2\2\u0196\u0197\7(\2\2\u0197\u0198\5\u00b8"+
		"]\2\u0198\u0199\7\13\2\2\u0199\u019a\5\u00b0Y\2\u019a\u01a1\5\u00c2b\2"+
		"\u019b\u019c\7\17\2\2\u019c\u019d\5\u00b0Y\2\u019d\u019e\5\u00c2b\2\u019e"+
		"\u01a0\3\2\2\2\u019f\u019b\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2"+
		"\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4"+
		"\u01a5\7\f\2\2\u01a5\u01a8\5\u0098M\2\u01a6\u01a7\7\63\2\2\u01a7\u01a9"+
		"\5\u0084C\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\25\3\2\2\2\u01aa"+
		"\u01ac\5\30\r\2\u01ab\u01ad\7\b\2\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3"+
		"\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\7\2\2\3\u01af\27\3\2\2\2\u01b0"+
		"\u01b1\7&\2\2\u01b1\u01b3\5\32\16\2\u01b2\u01b4\5|?\2\u01b3\u01b2\3\2"+
		"\2\2\u01b3\u01b4\3\2\2\2\u01b4\31\3\2\2\2\u01b5\u01b8\5\u00aaV\2\u01b6"+
		"\u01b7\7:\2\2\u01b7\u01b9\5\u00acW\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3"+
		"\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01bb\7?\2\2\u01bb\u01bd\5\u0094K\2\u01bc"+
		"\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c1\3\2\2\2\u01be\u01bf\5\u008c"+
		"G\2\u01bf\u01c0\5\u008eH\2\u01c0\u01c2\3\2\2\2\u01c1\u01be\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\33\3\2\2\2\u01c3\u01c5\5\36\20\2\u01c4\u01c6\7\b"+
		"\2\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01c8\7\2\2\3\u01c8\35\3\2\2\2\u01c9\u01ca\7!\2\2\u01ca\u01cb\7\"\2\2"+
		"\u01cb\u01cc\5 \21\2\u01cc\u01cd\7\r\2\2\u01cd\u01ce\5\"\22\2\u01ce\u01cf"+
		"\7\16\2\2\u01cf\u01d0\7\60\2\2\u01d0\u01d1\5\u00c2b\2\u01d1\u01d2\5$\23"+
		"\2\u01d2\37\3\2\2\2\u01d3\u01d4\5\u00c8e\2\u01d4!\3\2\2\2\u01d5\u01d6"+
		"\5\u00c8e\2\u01d6#\3\2\2\2\u01d7\u01d8\7m\2\2\u01d8%\3\2\2\2\u01d9\u01db"+
		"\5(\25\2\u01da\u01dc\7\b\2\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01de\7\2\2\3\u01de\'\3\2\2\2\u01df\u01e0\7!\2\2"+
		"\u01e0\u01e1\7#\2\2\u01e1\u01e2\5*\26\2\u01e2\u01e6\7;\2\2\u01e3\u01e4"+
		"\7G\2\2\u01e4\u01e7\5\u00ccg\2\u01e5\u01e7\5\u00e8u\2\u01e6\u01e3\3\2"+
		"\2\2\u01e6\u01e5\3\2\2\2\u01e7)\3\2\2\2\u01e8\u01e9\5\u00c8e\2\u01e9+"+
		"\3\2\2\2\u01ea\u01ec\5.\30\2\u01eb\u01ed\7\b\2\2\u01ec\u01eb\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\7\2\2\3\u01ef-\3\2\2\2"+
		"\u01f0\u01f2\5:\36\2\u01f1\u01f0\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1"+
		"\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6"+
		"\u01f7\7!\2\2\u01f7\u01f8\7c\2\2\u01f8\u01f9\5\60\31\2\u01f9\u01fa\7&"+
		"\2\2\u01fa\u01fb\5P)\2\u01fb\u01fc\5z>\2\u01fc\u01ff\7d\2\2\u01fd\u01fe"+
		"\7+\2\2\u01fe\u0200\5\u00a0Q\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2"+
		"\u0200\u0201\3\2\2\2\u0201\u0202\7G\2\2\u0202\u0203\5\62\32\2\u0203/\3"+
		"\2\2\2\u0204\u0205\5\u00c8e\2\u0205\61\3\2\2\2\u0206\u0209\5\66\34\2\u0207"+
		"\u0209\58\35\2\u0208\u0206\3\2\2\2\u0208\u0207\3\2\2\2\u0209\63\3\2\2"+
		"\2\u020a\u020b\t\2\2\2\u020b\65\3\2\2\2\u020c\u020d\5\64\33\2\u020d\u020e"+
		"\7\n\2\2\u020e\u020f\5\64\33\2\u020f\67\3\2\2\2\u0210\u0215\5\64\33\2"+
		"\u0211\u0212\7\17\2\2\u0212\u0214\5\64\33\2\u0213\u0211\3\2\2\2\u0214"+
		"\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u02169\3\2\2\2"+
		"\u0217\u0215\3\2\2\2\u0218\u0219\7\35\2\2\u0219\u022b\5\u00be`\2\u021a"+
		"\u021d\7\13\2\2\u021b\u021e\5> \2\u021c\u021e\5:\36\2\u021d\u021b\3\2"+
		"\2\2\u021d\u021c\3\2\2\2\u021e\u0226\3\2\2\2\u021f\u0222\7\17\2\2\u0220"+
		"\u0223\5> \2\u0221\u0223\5:\36\2\u0222\u0220\3\2\2\2\u0222\u0221\3\2\2"+
		"\2\u0223\u0225\3\2\2\2\u0224\u021f\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224"+
		"\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0229\3\2\2\2\u0228\u0226\3\2\2\2\u0229"+
		"\u022a\7\f\2\2\u022a\u022c\3\2\2\2\u022b\u021a\3\2\2\2\u022b\u022c\3\2"+
		"\2\2\u022c;\3\2\2\2\u022d\u022e\7\35\2\2\u022e\u022f\7%\2\2\u022f\u0230"+
		"\7\7\2\2\u0230\u023c\5\u00be`\2\u0231\u0232\7\13\2\2\u0232\u0237\5> \2"+
		"\u0233\u0234\7\17\2\2\u0234\u0236\5> \2\u0235\u0233\3\2\2\2\u0236\u0239"+
		"\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239"+
		"\u0237\3\2\2\2\u023a\u023b\7\f\2\2\u023b\u023d\3\2\2\2\u023c\u0231\3\2"+
		"\2\2\u023c\u023d\3\2\2\2\u023d=\3\2\2\2\u023e\u023f\5\u00aeX\2\u023f\u0240"+
		"\7\20\2\2\u0240\u0242\3\2\2\2\u0241\u023e\3\2\2\2\u0241\u0242\3\2\2\2"+
		"\u0242\u0243\3\2\2\2\u0243\u0244\5\u00b4[\2\u0244?\3\2\2\2\u0245\u0247"+
		"\5:\36\2\u0246\u0245\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248"+
		"\u0249\3\2\2\2\u0249\u024b\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024c\7\'"+
		"\2\2\u024c\u024d\7C\2\2\u024d\u024e\7\13\2\2\u024e\u0253\5D#\2\u024f\u0250"+
		"\7\17\2\2\u0250\u0252\5D#\2\u0251\u024f\3\2\2\2\u0252\u0255\3\2\2\2\u0253"+
		"\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2\2\2\u0255\u0253\3\2"+
		"\2\2\u0256\u0257\7\f\2\2\u0257\u025a\7D\2\2\u0258\u025b\5L\'\2\u0259\u025b"+
		"\5\4\3\2\u025a\u0258\3\2\2\2\u025a\u0259\3\2\2\2\u025b\u0263\3\2\2\2\u025c"+
		"\u025f\7\b\2\2\u025d\u0260\5L\'\2\u025e\u0260\5\4\3\2\u025f\u025d\3\2"+
		"\2\2\u025f\u025e\3\2\2\2\u0260\u0262\3\2\2\2\u0261\u025c\3\2\2\2\u0262"+
		"\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0267\3\2"+
		"\2\2\u0265\u0263\3\2\2\2\u0266\u0268\7\b\2\2\u0267\u0266\3\2\2\2\u0267"+
		"\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\7E\2\2\u026aA\3\2\2\2\u026b"+
		"\u026d\5@!\2\u026c\u026e\7\b\2\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2\2"+
		"\2\u026e\u026f\3\2\2\2\u026f\u0270\7\2\2\3\u0270C\3\2\2\2\u0271\u0272"+
		"\5\u0092J\2\u0272\u0273\79\2\2\u0273\u0274\5\u00a8U\2\u0274\u027a\3\2"+
		"\2\2\u0275\u0276\5F$\2\u0276\u0277\79\2\2\u0277\u0278\5\u00a8U\2\u0278"+
		"\u027a\3\2\2\2\u0279\u0271\3\2\2\2\u0279\u0275\3\2\2\2\u027aE\3\2\2\2"+
		"\u027b\u0280\5H%\2\u027c\u027d\7<\2\2\u027d\u027f\5H%\2\u027e\u027c\3"+
		"\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281"+
		"G\3\2\2\2\u0282\u0280\3\2\2\2\u0283\u0284\5\u0094K\2\u0284\u0285\7:\2"+
		"\2\u0285\u0286\5\u00e8u\2\u0286I\3\2\2\2\u0287\u0289\5L\'\2\u0288\u028a"+
		"\7\b\2\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\3\2\2\2\u028b"+
		"\u028c\7\2\2\3\u028cK\3\2\2\2\u028d\u028f\5:\36\2\u028e\u028d\3\2\2\2"+
		"\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0293"+
		"\3\2\2\2\u0292\u0290\3\2\2\2\u0293\u0294\7&\2\2\u0294\u0296\5N(\2\u0295"+
		"\u0297\5|?\2\u0296\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0299\3\2\2"+
		"\2\u0298\u029a\5\u0086D\2\u0299\u0298\3\2\2\2\u0299\u029a\3\2\2\2\u029a"+
		"\u029b\3\2\2\2\u029b\u029c\5\u0082B\2\u029cM\3\2\2\2\u029d\u02a3\5P)\2"+
		"\u029e\u02a3\5R*\2\u029f\u02a3\5V,\2\u02a0\u02a3\5j\66\2\u02a1\u02a3\5"+
		"r:\2\u02a2\u029d\3\2\2\2\u02a2\u029e\3\2\2\2\u02a2\u029f\3\2\2\2\u02a2"+
		"\u02a0\3\2\2\2\u02a2\u02a1\3\2\2\2\u02a3O\3\2\2\2\u02a4\u02a6\5\u00b8"+
		"]\2\u02a5\u02a7\5f\64\2\u02a6\u02a5\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7"+
		"\u02a9\3\2\2\2\u02a8\u02aa\5x=\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3\2\2"+
		"\2\u02aa\u02ac\3\2\2\2\u02ab\u02ad\5f\64\2\u02ac\u02ab\3\2\2\2\u02ac\u02ad"+
		"\3\2\2\2\u02adQ\3\2\2\2\u02ae\u02af\5T+\2\u02af\u02b0\5\u00c4c\2\u02b0"+
		"\u02b1\5T+\2\u02b1\u02b4\7Q\2\2\u02b2\u02b3\7?\2\2\u02b3\u02b5\5\u0094"+
		"K\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b9\3\2\2\2\u02b6"+
		"\u02b7\5\u008cG\2\u02b7\u02b8\5\u008eH\2\u02b8\u02ba\3\2\2\2\u02b9\u02b6"+
		"\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02d5\3\2\2\2\u02bb\u02bc\5T+\2\u02bc"+
		"\u02bd\5\u00c4c\2\u02bd\u02c0\5T+\2\u02be\u02bf\7?\2\2\u02bf\u02c1\5\u0094"+
		"K\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c5\3\2\2\2\u02c2"+
		"\u02c3\5\u008cG\2\u02c3\u02c4\5\u008eH\2\u02c4\u02c6\3\2\2\2\u02c5\u02c2"+
		"\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02d5\3\2\2\2\u02c7\u02c8\5T+\2\u02c8"+
		"\u02c9\7Q\2\2\u02c9\u02ca\5\u00c4c\2\u02ca\u02cd\5T+\2\u02cb\u02cc\7?"+
		"\2\2\u02cc\u02ce\5\u0094K\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"\u02d2\3\2\2\2\u02cf\u02d0\5\u008cG\2\u02d0\u02d1\5\u008eH\2\u02d1\u02d3"+
		"\3\2\2\2\u02d2\u02cf\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d5\3\2\2\2\u02d4"+
		"\u02ae\3\2\2\2\u02d4\u02bb\3\2\2\2\u02d4\u02c7\3\2\2\2\u02d5S\3\2\2\2"+
		"\u02d6\u02d8\5\u00b8]\2\u02d7\u02d9\5f\64\2\u02d8\u02d7\3\2\2\2\u02d8"+
		"\u02d9\3\2\2\2\u02d9\u02db\3\2\2\2\u02da\u02dc\5x=\2\u02db\u02da\3\2\2"+
		"\2\u02db\u02dc\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02de\7:\2\2\u02de\u02e0"+
		"\5\u00acW\2\u02df\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0U\3\2\2\2\u02e1"+
		"\u02e2\5X-\2\u02e2W\3\2\2\2\u02e3\u02e4\b-\1\2\u02e4\u02e5\7\13\2\2\u02e5"+
		"\u02e6\5X-\2\u02e6\u02e8\7\f\2\2\u02e7\u02e9\5\u008aF\2\u02e8\u02e7\3"+
		"\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02f8\3\2\2\2\u02ea\u02eb\7G\2\2\u02eb"+
		"\u02ec\7\13\2\2\u02ec\u02ed\5Z.\2\u02ed\u02ef\7\f\2\2\u02ee\u02f0\5\u008a"+
		"F\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f8\3\2\2\2\u02f1"+
		"\u02f8\5Z.\2\u02f2\u02f3\7G\2\2\u02f3\u02f5\5\\/\2\u02f4\u02f6\5\u008a"+
		"F\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f8\3\2\2\2\u02f7"+
		"\u02e3\3\2\2\2\u02f7\u02ea\3\2\2\2\u02f7\u02f1\3\2\2\2\u02f7\u02f2\3\2"+
		"\2\2\u02f8\u02fe\3\2\2\2\u02f9\u02fa\f\5\2\2\u02fa\u02fb\7\36\2\2\u02fb"+
		"\u02fd\5X-\6\u02fc\u02f9\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02fc\3\2\2"+
		"\2\u02fe\u02ff\3\2\2\2\u02ffY\3\2\2\2\u0300\u02fe\3\2\2\2\u0301\u0302"+
		"\b.\1\2\u0302\u0303\7\13\2\2\u0303\u0304\5Z.\2\u0304\u0306\7\f\2\2\u0305"+
		"\u0307\5\u008aF\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u030d"+
		"\3\2\2\2\u0308\u030a\5\\/\2\u0309\u030b\5\u008aF\2\u030a\u0309\3\2\2\2"+
		"\u030a\u030b\3\2\2\2\u030b\u030d\3\2\2\2\u030c\u0301\3\2\2\2\u030c\u0308"+
		"\3\2\2\2\u030d\u0313\3\2\2\2\u030e\u030f\f\4\2\2\u030f\u0310\7\36\2\2"+
		"\u0310\u0312\5Z.\5\u0311\u030e\3\2\2\2\u0312\u0315\3\2\2\2\u0313\u0311"+
		"\3\2\2\2\u0313\u0314\3\2\2\2\u0314[\3\2\2\2\u0315\u0313\3\2\2\2\u0316"+
		"\u031a\5^\60\2\u0317\u031a\5`\61\2\u0318\u031a\5b\62\2\u0319\u0316\3\2"+
		"\2\2\u0319\u0317\3\2\2\2\u0319\u0318\3\2\2\2\u031a]\3\2\2\2\u031b\u031c"+
		"\7A\2\2\u031c\u031f\5b\62\2\u031d\u031e\7=\2\2\u031e\u0320\5b\62\2\u031f"+
		"\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u032a\3\2\2\2\u0321\u0322\5b"+
		"\62\2\u0322\u0323\7=\2\2\u0323\u0324\5b\62\2\u0324\u032a\3\2\2\2\u0325"+
		"\u0326\5b\62\2\u0326\u0327\7<\2\2\u0327\u0328\5b\62\2\u0328\u032a\3\2"+
		"\2\2\u0329\u031b\3\2\2\2\u0329\u0321\3\2\2\2\u0329\u0325\3\2\2\2\u032a"+
		"_\3\2\2\2\u032b\u032c\5b\62\2\u032c\u032d\7\27\2\2\u032d\u032e\5\u00c0"+
		"a\2\u032e\u032f\7\31\2\2\u032fa\3\2\2\2\u0330\u0331\5\u00bc_\2\u0331\u0332"+
		"\7\20\2\2\u0332\u0334\3\2\2\2\u0333\u0330\3\2\2\2\u0333\u0334\3\2\2\2"+
		"\u0334\u0335\3\2\2\2\u0335\u0336\5d\63\2\u0336c\3\2\2\2\u0337\u0339\5"+
		"\u00b8]\2\u0338\u033a\5f\64\2\u0339\u0338\3\2\2\2\u0339\u033a\3\2\2\2"+
		"\u033ae\3\2\2\2\u033b\u033d\5h\65\2\u033c\u033b\3\2\2\2\u033d\u033e\3"+
		"\2\2\2\u033e\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033fg\3\2\2\2\u0340\u0343"+
		"\5t;\2\u0341\u0343\5v<\2\u0342\u0340\3\2\2\2\u0342\u0341\3\2\2\2\u0343"+
		"i\3\2\2\2\u0344\u0346\7G\2\2\u0345\u0344\3\2\2\2\u0345\u0346\3\2\2\2\u0346"+
		"\u0347\3\2\2\2\u0347\u0349\5n8\2\u0348\u034a\5\u008aF\2\u0349\u0348\3"+
		"\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034c\7\17\2\2\u034c"+
		"\u034d\5l\67\2\u034dk\3\2\2\2\u034e\u034f\b\67\1\2\u034f\u0350\7\13\2"+
		"\2\u0350\u0351\5l\67\2\u0351\u0353\7\f\2\2\u0352\u0354\5\u008aF\2\u0353"+
		"\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u035a\3\2\2\2\u0355\u0357\5n"+
		"8\2\u0356\u0358\5\u008aF\2\u0357\u0356\3\2\2\2\u0357\u0358\3\2\2\2\u0358"+
		"\u035a\3\2\2\2\u0359\u034e\3\2\2\2\u0359\u0355\3\2\2\2\u035a\u0360\3\2"+
		"\2\2\u035b\u035c\f\4\2\2\u035c\u035d\7\17\2\2\u035d\u035f\5l\67\5\u035e"+
		"\u035b\3\2\2\2\u035f\u0362\3\2\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2"+
		"\2\2\u0361m\3\2\2\2\u0362\u0360\3\2\2\2\u0363\u0367\5^\60\2\u0364\u0367"+
		"\5p9\2\u0365\u0367\5b\62\2\u0366\u0363\3\2\2\2\u0366\u0364\3\2\2\2\u0366"+
		"\u0365\3\2\2\2\u0367o\3\2\2\2\u0368\u0370\5b\62\2\u0369\u036a\7\27\2\2"+
		"\u036a\u036b\5\u00c0a\2\u036b\u036c\7\31\2\2\u036c\u0371\3\2\2\2\u036d"+
		"\u0371\7\21\2\2\u036e\u0371\7\23\2\2\u036f\u0371\7\22\2\2\u0370\u0369"+
		"\3\2\2\2\u0370\u036d\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u036f\3\2\2\2\u0371"+
		"q\3\2\2\2\u0372\u0373\7\13\2\2\u0373\u0374\5r:\2\u0374\u0375\7\f\2\2\u0375"+
		"\u0383\3\2\2\2\u0376\u0377\7&\2\2\u0377\u0379\5N(\2\u0378\u037a\5|?\2"+
		"\u0379\u0378\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037c\3\2\2\2\u037b\u037d"+
		"\5\u0086D\2\u037c\u037b\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037e\3\2\2"+
		"\2\u037e\u0380\7\60\2\2\u037f\u0381\5\u0084C\2\u0380\u037f\3\2\2\2\u0380"+
		"\u0381\3\2\2\2\u0381\u0383\3\2\2\2\u0382\u0372\3\2\2\2\u0382\u0376\3\2"+
		"\2\2\u0383s\3\2\2\2\u0384\u0386\7\37\2\2\u0385\u0384\3\2\2\2\u0385\u0386"+
		"\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0388\7\r\2\2\u0388\u0389\5\u0094K"+
		"\2\u0389\u038a\7\16\2\2\u038au\3\2\2\2\u038b\u038c\7\37\2\2\u038c\u038d"+
		"\5\u0098M\2\u038dw\3\2\2\2\u038e\u038f\7\37\2\2\u038f\u0390\7(\2\2\u0390"+
		"\u0391\7\t\2\2\u0391\u0392\5\u0098M\2\u0392y\3\2\2\2\u0393\u039d\7)\2"+
		"\2\u0394\u039e\7\21\2\2\u0395\u039a\5\u0090I\2\u0396\u0397\7\17\2\2\u0397"+
		"\u0399\5\u0090I\2\u0398\u0396\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u0398"+
		"\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039e\3\2\2\2\u039c\u039a\3\2\2\2\u039d"+
		"\u0394\3\2\2\2\u039d\u0395\3\2\2\2\u039e\u03a0\3\2\2\2\u039f\u03a1\5~"+
		"@\2\u03a0\u039f\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1{\3\2\2\2\u03a2\u03a4"+
		"\5z>\2\u03a3\u03a5\5\u0080A\2\u03a4\u03a3\3\2\2\2\u03a4\u03a5\3\2\2\2"+
		"\u03a5}\3\2\2\2\u03a6\u03a7\7*\2\2\u03a7\u03a8\7+\2\2\u03a8\u03ad\5\u00a0"+
		"Q\2\u03a9\u03aa\7\17\2\2\u03aa\u03ac\5\u00a0Q\2\u03ab\u03a9\3\2\2\2\u03ac"+
		"\u03af\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\177\3\2\2"+
		"\2\u03af\u03ad\3\2\2\2\u03b0\u03b1\7,\2\2\u03b1\u03b2\5\u0094K\2\u03b2"+
		"\u0081\3\2\2\2\u03b3\u03b5\7-\2\2\u03b4\u03b6\5\u0084C\2\u03b5\u03b4\3"+
		"\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\7\62\2\2\u03b8"+
		"\u03dc\5\u00ba^\2\u03b9\u03ba\7.\2\2\u03ba\u03bd\5\u00ba^\2\u03bb\u03bc"+
		"\7\67\2\2\u03bc\u03be\5\u0084C\2\u03bd\u03bb\3\2\2\2\u03bd\u03be\3\2\2"+
		"\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\7?\2\2\u03c0\u03c1\5\u0094K\2\u03c1"+
		"\u03dc\3\2\2\2\u03c2\u03c3\7/\2\2\u03c3\u03c4\7<\2\2\u03c4\u03c5\7-\2"+
		"\2\u03c5\u03c6\7\62\2\2\u03c6\u03c9\5\u00ba^\2\u03c7\u03c8\7\67\2\2\u03c8"+
		"\u03ca\5\u0084C\2\u03c9\u03c7\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cb"+
		"\3\2\2\2\u03cb\u03cc\7?\2\2\u03cc\u03cd\5\u0094K\2\u03cd\u03dc\3\2\2\2"+
		"\u03ce\u03cf\7/\2\2\u03cf\u03d2\5\u00ba^\2\u03d0\u03d1\7\67\2\2\u03d1"+
		"\u03d3\5\u0084C\2\u03d2\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4"+
		"\3\2\2\2\u03d4\u03d5\7?\2\2\u03d5\u03d6\5\u0094K\2\u03d6\u03dc\3\2\2\2"+
		"\u03d7\u03d9\7\60\2\2\u03d8\u03da\5\u0084C\2\u03d9\u03d8\3\2\2\2\u03d9"+
		"\u03da\3\2\2\2\u03da\u03dc\3\2\2\2\u03db\u03b3\3\2\2\2\u03db\u03b9\3\2"+
		"\2\2\u03db\u03c2\3\2\2\2\u03db\u03ce\3\2\2\2\u03db\u03d7\3\2\2\2\u03dc"+
		"\u0083\3\2\2\2\u03dd\u03de\7I\2\2\u03de\u03ec\7\61\2\2\u03df\u03e0\7I"+
		"\2\2\u03e0\u03e1\78\2\2\u03e1\u03ec\7\61\2\2\u03e2\u03e3\7\64\2\2\u03e3"+
		"\u03ec\7\61\2\2\u03e4\u03e5\7\64\2\2\u03e5\u03e6\78\2\2\u03e6\u03ec\7"+
		"\61\2\2\u03e7\u03e9\7\65\2\2\u03e8\u03e7\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9"+
		"\u03ea\3\2\2\2\u03ea\u03ec\7\61\2\2\u03eb\u03dd\3\2\2\2\u03eb\u03df\3"+
		"\2\2\2\u03eb\u03e2\3\2\2\2\u03eb\u03e4\3\2\2\2\u03eb\u03e8\3\2\2\2\u03ec"+
		"\u0085\3\2\2\2\u03ed\u03ef\7\63\2\2\u03ee\u03f0\5\u0088E\2\u03ef\u03ee"+
		"\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f5\7G\2\2\u03f2"+
		"\u03f6\5\u00ccg\2\u03f3\u03f4\7\3\2\2\u03f4\u03f6\7\61\2\2\u03f5\u03f2"+
		"\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f6\u03fc\3\2\2\2\u03f7\u03f8\7\63\2\2"+
		"\u03f8\u03f9\7\66\2\2\u03f9\u03fa\7G\2\2\u03fa\u03fc\5\u00ccg\2\u03fb"+
		"\u03ed\3\2\2\2\u03fb\u03f7\3\2\2\2\u03fc\u0087\3\2\2\2\u03fd\u03fe\t\3"+
		"\2\2\u03fe\u0089\3\2\2\2\u03ff\u0400\7B\2\2\u0400\u0401\5\u00ccg\2\u0401"+
		"\u008b\3\2\2\2\u0402\u0403\7B\2\2\u0403\u0406\5\u0094K\2\u0404\u0405\7"+
		"\17\2\2\u0405\u0407\5\u0094K\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2\2\2"+
		"\u0407\u008d\3\2\2\2\u0408\u0409\7e\2\2\u0409\u040a\5\u0094K\2\u040a\u008f"+
		"\3\2\2\2\u040b\u040c\5\u0092J\2\u040c\u040d\7:\2\2\u040d\u040e\5\u00b0"+
		"Y\2\u040e\u0411\3\2\2\2\u040f\u0411\5\u00a0Q\2\u0410\u040b\3\2\2\2\u0410"+
		"\u040f\3\2\2\2\u0411\u0091\3\2\2\2\u0412\u0413\5\u0096L\2\u0413\u0093"+
		"\3\2\2\2\u0414\u0415\5\u0096L\2\u0415\u0095\3\2\2\2\u0416\u0417\bL\1\2"+
		"\u0417\u0418\7A\2\2\u0418\u0422\5\u0096L\r\u0419\u041a\7\13\2\2\u041a"+
		"\u041b\5\u0096L\2\u041b\u041c\7\f\2\2\u041c\u0422\3\2\2\2\u041d\u0422"+
		"\5\u009cO\2\u041e\u0422\5\u0098M\2\u041f\u0422\5\u00c6d\2\u0420\u0422"+
		"\5\u00a0Q\2\u0421\u0416\3\2\2\2\u0421\u0419\3\2\2\2\u0421\u041d\3\2\2"+
		"\2\u0421\u041e\3\2\2\2\u0421\u041f\3\2\2\2\u0421\u0420\3\2\2\2\u0422\u0449"+
		"\3\2\2\2\u0423\u0427\f\f\2\2\u0424\u0428\7\21\2\2\u0425\u0428\7\25\2\2"+
		"\u0426\u0428\7\26\2\2\u0427\u0424\3\2\2\2\u0427\u0425\3\2\2\2\u0427\u0426"+
		"\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u0448\5\u0096L\r\u042a\u042d\f\13\2"+
		"\2\u042b\u042e\7\22\2\2\u042c\u042e\7\24\2\2\u042d\u042b\3\2\2\2\u042d"+
		"\u042c\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0448\5\u0096L\f\u0430\u0435"+
		"\f\n\2\2\u0431\u0436\7\32\2\2\u0432\u0436\7\30\2\2\u0433\u0436\7\31\2"+
		"\2\u0434\u0436\7\27\2\2\u0435\u0431\3\2\2\2\u0435\u0432\3\2\2\2\u0435"+
		"\u0433\3\2\2\2\u0435\u0434\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0448\5\u0096"+
		"L\13\u0438\u043b\f\t\2\2\u0439\u043c\7\33\2\2\u043a\u043c\7\34\2\2\u043b"+
		"\u0439\3\2\2\2\u043b\u043a\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u0448\5\u0096"+
		"L\n\u043e\u043f\f\7\2\2\u043f\u0440\7=\2\2\u0440\u0448\5\u0096L\b\u0441"+
		"\u0442\f\6\2\2\u0442\u0443\7<\2\2\u0443\u0448\5\u0096L\7\u0444\u0445\f"+
		"\b\2\2\u0445\u0446\7>\2\2\u0446\u0448\5\u00be`\2\u0447\u0423\3\2\2\2\u0447"+
		"\u042a\3\2\2\2\u0447\u0430\3\2\2\2\u0447\u0438\3\2\2\2\u0447\u043e\3\2"+
		"\2\2\u0447\u0441\3\2\2\2\u0447\u0444\3\2\2\2\u0448\u044b\3\2\2\2\u0449"+
		"\u0447\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u0097\3\2\2\2\u044b\u0449\3\2"+
		"\2\2\u044c\u044d\5\u00a6T\2\u044d\u044e\7\7\2\2\u044e\u0450\3\2\2\2\u044f"+
		"\u044c\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0452\5\u00a4"+
		"S\2\u0452\u0454\7\13\2\2\u0453\u0455\5\u009aN\2\u0454\u0453\3\2\2\2\u0454"+
		"\u0455\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0457\7\f\2\2\u0457\u0099\3\2"+
		"\2\2\u0458\u045d\5\u0092J\2\u0459\u045a\7\17\2\2\u045a\u045c\5\u0092J"+
		"\2\u045b\u0459\3\2\2\2\u045c\u045f\3\2\2\2\u045d\u045b\3\2\2\2\u045d\u045e"+
		"\3\2\2\2\u045e\u0462\3\2\2\2\u045f\u045d\3\2\2\2\u0460\u0462\7\21\2\2"+
		"\u0461\u0458\3\2\2\2\u0461\u0460\3\2\2\2\u0462\u009b\3\2\2\2\u0463\u0467"+
		"\5\u009eP\2\u0464\u0467\5\u00a0Q\2\u0465\u0467\5\u0098M\2\u0466\u0463"+
		"\3\2\2\2\u0466\u0464\3\2\2\2\u0466\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468"+
		"\u0469\7@\2\2\u0469\u046a\7F\2\2\u046a\u009d\3\2\2\2\u046b\u046d\7\37"+
		"\2\2\u046c\u046b\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046e\3\2\2\2\u046e"+
		"\u0473\5\u00be`\2\u046f\u0470\7\r\2\2\u0470\u0471\5\u00a2R\2\u0471\u0472"+
		"\7\16\2\2\u0472\u0474\3\2\2\2\u0473\u046f\3\2\2\2\u0473\u0474\3\2\2\2"+
		"\u0474\u009f\3\2\2\2\u0475\u0477\7\37\2\2\u0476\u0475\3\2\2\2\u0476\u0477"+
		"\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u047d\5\u00be`\2\u0479\u047a\7\r\2"+
		"\2\u047a\u047b\5\u00a2R\2\u047b\u047c\7\16\2\2\u047c\u047e\3\2\2\2\u047d"+
		"\u0479\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u0487\3\2\2\2\u047f\u0480\7\37"+
		"\2\2\u0480\u0485\5\u00be`\2\u0481\u0482\7\r\2\2\u0482\u0483\5\u00a2R\2"+
		"\u0483\u0484\7\16\2\2\u0484\u0486\3\2\2\2\u0485\u0481\3\2\2\2\u0485\u0486"+
		"\3\2\2\2\u0486\u0488\3\2\2\2\u0487\u047f\3\2\2\2\u0487\u0488\3\2\2\2\u0488"+
		"\u0489\3\2\2\2\u0489\u048a\7\t\2\2\u048a\u048b\5\u00b0Y\2\u048b\u048e"+
		"\3\2\2\2\u048c\u048e\5\u00b0Y\2\u048d\u0476\3\2\2\2\u048d\u048c\3\2\2"+
		"\2\u048e\u00a1\3\2\2\2\u048f\u0496\7\3\2\2\u0490\u0493\7H\2\2\u0491\u0492"+
		"\7\24\2\2\u0492\u0494\7\3\2\2\u0493\u0491\3\2\2\2\u0493\u0494\3\2\2\2"+
		"\u0494\u0496\3\2\2\2\u0495\u048f\3\2\2\2\u0495\u0490\3\2\2\2\u0496\u00a3"+
		"\3\2\2\2\u0497\u0498\5\u00be`\2\u0498\u00a5\3\2\2\2\u0499\u049a\5\u00be"+
		"`\2\u049a\u00a7\3\2\2\2\u049b\u049c\5\u00be`\2\u049c\u00a9\3\2\2\2\u049d"+
		"\u049e\5\u00be`\2\u049e\u00ab\3\2\2\2\u049f\u04a0\5\u00be`\2\u04a0\u00ad"+
		"\3\2\2\2\u04a1\u04a7\5\u00be`\2\u04a2\u04a3\5\u00b6\\\2\u04a3\u04a4\5"+
		"\u00be`\2\u04a4\u04a6\3\2\2\2\u04a5\u04a2\3\2\2\2\u04a6\u04a9\3\2\2\2"+
		"\u04a7\u04a5\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u00af\3\2\2\2\u04a9\u04a7"+
		"\3\2\2\2\u04aa\u04ab\5\u00be`\2\u04ab\u00b1\3\2\2\2\u04ac\u04ad\5\u00be"+
		"`\2\u04ad\u00b3\3\2\2\2\u04ae\u04af\5\u00e8u\2\u04af\u00b5\3\2\2\2\u04b0"+
		"\u04b1\t\4\2\2\u04b1\u00b7\3\2\2\2\u04b2\u04b4\7\37\2\2\u04b3\u04b2\3"+
		"\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b6\5\u00a8U\2"+
		"\u04b6\u00b9\3\2\2\2\u04b7\u04b8\5\u00b8]\2\u04b8\u00bb\3\2\2\2\u04b9"+
		"\u04ba\5\u00be`\2\u04ba\u00bd\3\2\2\2\u04bb\u04be\5\u00c8e\2\u04bc\u04be"+
		"\5\u00caf\2\u04bd\u04bb\3\2\2\2\u04bd\u04bc\3\2\2\2\u04be\u00bf\3\2\2"+
		"\2\u04bf\u04c0\7\3\2\2\u04c0\u04c1\7\7\2\2\u04c1\u04c8\7\3\2\2\u04c2\u04c3"+
		"\7\3\2\2\u04c3\u04c8\7\7\2\2\u04c4\u04c5\7\7\2\2\u04c5\u04c8\7\3\2\2\u04c6"+
		"\u04c8\7\3\2\2\u04c7\u04bf\3\2\2\2\u04c7\u04c2\3\2\2\2\u04c7\u04c4\3\2"+
		"\2\2\u04c7\u04c6\3\2\2\2\u04c8\u00c1\3\2\2\2\u04c9\u04ca\t\5\2\2\u04ca"+
		"\u00c3\3\2\2\2\u04cb\u04cc\7O\2\2\u04cc\u04cd\7M\2\2\u04cd\u04db\7K\2"+
		"\2\u04ce\u04cf\7N\2\2\u04cf\u04d0\7M\2\2\u04d0\u04db\7K\2\2\u04d1\u04d2"+
		"\7P\2\2\u04d2\u04d3\7M\2\2\u04d3\u04db\7K\2\2\u04d4\u04d5\7M\2\2\u04d5"+
		"\u04db\7K\2\2\u04d6\u04d8\7L\2\2\u04d7\u04d6\3\2\2\2\u04d7\u04d8\3\2\2"+
		"\2\u04d8\u04d9\3\2\2\2\u04d9\u04db\7K\2\2\u04da\u04cb\3\2\2\2\u04da\u04ce"+
		"\3\2\2\2\u04da\u04d1\3\2\2\2\u04da\u04d4\3\2\2\2\u04da\u04d7\3\2\2\2\u04db"+
		"\u00c5\3\2\2\2\u04dc\u04e4\5\u00e6t\2\u04dd\u04e4\5\u00dep\2\u04de\u04e4"+
		"\5\u00e2r\2\u04df\u04e4\5\u00e0q\2\u04e0\u04e4\5\u00e4s\2\u04e1\u04e4"+
		"\5\u00ccg\2\u04e2\u04e4\5\u00e8u\2\u04e3\u04dc\3\2\2\2\u04e3\u04dd\3\2"+
		"\2\2\u04e3\u04de\3\2\2\2\u04e3\u04df\3\2\2\2\u04e3\u04e0\3\2\2\2\u04e3"+
		"\u04e1\3\2\2\2\u04e3\u04e2\3\2\2\2\u04e4\u00c7\3\2\2\2\u04e5\u04e6\t\6"+
		"\2\2\u04e6\u00c9\3\2\2\2\u04e7\u04e8\t\7\2\2\u04e8\u00cb\3\2\2\2\u04e9"+
		"\u04eb\5\u00ceh\2\u04ea\u04ec\5\u00d0i\2\u04eb\u04ea\3\2\2\2\u04eb\u04ec"+
		"\3\2\2\2\u04ec\u04ee\3\2\2\2\u04ed\u04ef\5\u00d2j\2\u04ee\u04ed\3\2\2"+
		"\2\u04ee\u04ef\3\2\2\2\u04ef\u04f1\3\2\2\2\u04f0\u04f2\5\u00d4k\2\u04f1"+
		"\u04f0\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f4\3\2\2\2\u04f3\u04f5\5\u00d6"+
		"l\2\u04f4\u04f3\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f7\3\2\2\2\u04f6"+
		"\u04f8\5\u00d8m\2\u04f7\u04f6\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fa"+
		"\3\2\2\2\u04f9\u04fb\5\u00dan\2\u04fa\u04f9\3\2\2\2\u04fa\u04fb\3\2\2"+
		"\2\u04fb\u04fd\3\2\2\2\u04fc\u04fe\5\u00dco\2\u04fd\u04fc\3\2\2\2\u04fd"+
		"\u04fe\3\2\2\2\u04fe\u0546\3\2\2\2\u04ff\u0501\5\u00d0i\2\u0500\u0502"+
		"\5\u00d2j\2\u0501\u0500\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0504\3\2\2"+
		"\2\u0503\u0505\5\u00d4k\2\u0504\u0503\3\2\2\2\u0504\u0505\3\2\2\2\u0505"+
		"\u0507\3\2\2\2\u0506\u0508\5\u00d6l\2\u0507\u0506\3\2\2\2\u0507\u0508"+
		"\3\2\2\2\u0508\u050a\3\2\2\2\u0509\u050b\5\u00d8m\2\u050a\u0509\3\2\2"+
		"\2\u050a\u050b\3\2\2\2\u050b\u050d\3\2\2\2\u050c\u050e\5\u00dan\2\u050d"+
		"\u050c\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u0510\3\2\2\2\u050f\u0511\5\u00dc"+
		"o\2\u0510\u050f\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0546\3\2\2\2\u0512"+
		"\u0514\5\u00d2j\2\u0513\u0515\5\u00d4k\2\u0514\u0513\3\2\2\2\u0514\u0515"+
		"\3\2\2\2\u0515\u0517\3\2\2\2\u0516\u0518\5\u00d6l\2\u0517\u0516\3\2\2"+
		"\2\u0517\u0518\3\2\2\2\u0518\u051a\3\2\2\2\u0519\u051b\5\u00d8m\2\u051a"+
		"\u0519\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051d\3\2\2\2\u051c\u051e\5\u00da"+
		"n\2\u051d\u051c\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u0520\3\2\2\2\u051f"+
		"\u0521\5\u00dco\2\u0520\u051f\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0546"+
		"\3\2\2\2\u0522\u0524\5\u00d4k\2\u0523\u0525\5\u00d6l\2\u0524\u0523\3\2"+
		"\2\2\u0524\u0525\3\2\2\2\u0525\u0527\3\2\2\2\u0526\u0528\5\u00d8m\2\u0527"+
		"\u0526\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u052a\3\2\2\2\u0529\u052b\5\u00da"+
		"n\2\u052a\u0529\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052d\3\2\2\2\u052c"+
		"\u052e\5\u00dco\2\u052d\u052c\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u0546"+
		"\3\2\2\2\u052f\u0531\5\u00d6l\2\u0530\u0532\5\u00d8m\2\u0531\u0530\3\2"+
		"\2\2\u0531\u0532\3\2\2\2\u0532\u0534\3\2\2\2\u0533\u0535\5\u00dan\2\u0534"+
		"\u0533\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0537\3\2\2\2\u0536\u0538\5\u00dc"+
		"o\2\u0537\u0536\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u0546\3\2\2\2\u0539"+
		"\u053b\5\u00d8m\2\u053a\u053c\5\u00dan\2\u053b\u053a\3\2\2\2\u053b\u053c"+
		"\3\2\2\2\u053c\u053e\3\2\2\2\u053d\u053f\5\u00dco\2\u053e\u053d\3\2\2"+
		"\2\u053e\u053f\3\2\2\2\u053f\u0546\3\2\2\2\u0540\u0542\5\u00dan\2\u0541"+
		"\u0543\5\u00dco\2\u0542\u0541\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0546"+
		"\3\2\2\2\u0544\u0546\5\u00dco\2\u0545\u04e9\3\2\2\2\u0545\u04ff\3\2\2"+
		"\2\u0545\u0512\3\2\2\2\u0545\u0522\3\2\2\2\u0545\u052f\3\2\2\2\u0545\u0539"+
		"\3\2\2\2\u0545\u0540\3\2\2\2\u0545\u0544\3\2\2\2\u0546\u00cd\3\2\2\2\u0547"+
		"\u0548\7\3\2\2\u0548\u0549\7R\2\2\u0549\u00cf\3\2\2\2\u054a\u054b\7\3"+
		"\2\2\u054b\u054c\7S\2\2\u054c\u00d1\3\2\2\2\u054d\u054e\7\3\2\2\u054e"+
		"\u054f\7T\2\2\u054f\u00d3\3\2\2\2\u0550\u0551\7\3\2\2\u0551\u0552\7U\2"+
		"\2\u0552\u00d5\3\2\2\2\u0553\u0554\7\3\2\2\u0554\u0555\7V\2\2\u0555\u00d7"+
		"\3\2\2\2\u0556\u0557\7\3\2\2\u0557\u0558\7W\2\2\u0558\u00d9\3\2\2\2\u0559"+
		"\u055a\7\3\2\2\u055a\u055b\7X\2\2\u055b\u00db\3\2\2\2\u055c\u055d\7\3"+
		"\2\2\u055d\u055e\7Y\2\2\u055e\u00dd\3\2\2\2\u055f\u0561\t\b\2\2\u0560"+
		"\u055f\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0563\7\6"+
		"\2\2\u0563\u00df\3\2\2\2\u0564\u0566\t\b\2\2\u0565\u0564\3\2\2\2\u0565"+
		"\u0566\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0568\7\4\2\2\u0568\u00e1\3\2"+
		"\2\2\u0569\u056b\t\b\2\2\u056a\u0569\3\2\2\2\u056a\u056b\3\2\2\2\u056b"+
		"\u056c\3\2\2\2\u056c\u056d\7\5\2\2\u056d\u00e3\3\2\2\2\u056e\u0570\t\b"+
		"\2\2\u056f\u056e\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0571\3\2\2\2\u0571"+
		"\u0572\7\3\2\2\u0572\u00e5\3\2\2\2\u0573\u0574\t\t\2\2\u0574\u00e7\3\2"+
		"\2\2\u0575\u0576\7h\2\2\u0576\u00e9\3\2\2\2\u00b9\u00f1\u00f3\u00fd\u0107"+
		"\u010b\u010f\u0114\u0119\u011d\u0121\u012b\u0135\u0139\u013f\u0143\u0147"+
		"\u0149\u014d\u0151\u0158\u0167\u016e\u0175\u0184\u018b\u0192\u01a1\u01a8"+
		"\u01ac\u01b3\u01b8\u01bc\u01c1\u01c5\u01db\u01e6\u01ec\u01f3\u01ff\u0208"+
		"\u0215\u021d\u0222\u0226\u022b\u0237\u023c\u0241\u0248\u0253\u025a\u025f"+
		"\u0263\u0267\u026d\u0279\u0280\u0289\u0290\u0296\u0299\u02a2\u02a6\u02a9"+
		"\u02ac\u02b4\u02b9\u02c0\u02c5\u02cd\u02d2\u02d4\u02d8\u02db\u02df\u02e8"+
		"\u02ef\u02f5\u02f7\u02fe\u0306\u030a\u030c\u0313\u0319\u031f\u0329\u0333"+
		"\u0339\u033e\u0342\u0345\u0349\u0353\u0357\u0359\u0360\u0366\u0370\u0379"+
		"\u037c\u0380\u0382\u0385\u039a\u039d\u03a0\u03a4\u03ad\u03b5\u03bd\u03c9"+
		"\u03d2\u03d9\u03db\u03e8\u03eb\u03ef\u03f5\u03fb\u0406\u0410\u0421\u0427"+
		"\u042d\u0435\u043b\u0447\u0449\u044f\u0454\u045d\u0461\u0466\u046c\u0473"+
		"\u0476\u047d\u0485\u0487\u048d\u0493\u0495\u04a7\u04b3\u04bd\u04c7\u04d7"+
		"\u04da\u04e3\u04eb\u04ee\u04f1\u04f4\u04f7\u04fa\u04fd\u0501\u0504\u0507"+
		"\u050a\u050d\u0510\u0514\u0517\u051a\u051d\u0520\u0524\u0527\u052a\u052d"+
		"\u0531\u0534\u0537\u053b\u053e\u0542\u0545\u0560\u0565\u056a\u056f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}