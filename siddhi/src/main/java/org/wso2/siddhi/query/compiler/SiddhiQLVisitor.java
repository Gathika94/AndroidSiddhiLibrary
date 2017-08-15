// Generated from /home/chamath/Projects/AndroidSiddhi/siddhi/src/main/antlr4/org/wso2/siddhi/query/compiler/SiddhiQL.g4 by ANTLR 4.2.2
package org.wso2.siddhi.query.compiler;

	//import org.wso2.siddhi.query.compiler.exception.SiddhiParserException;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SiddhiQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SiddhiQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#function_namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_namespace(@NotNull SiddhiQLParser.Function_namespaceContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_stream(@NotNull SiddhiQLParser.Definition_streamContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_aggregation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_aggregation(@NotNull SiddhiQLParser.Definition_aggregationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#query_output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_output(@NotNull SiddhiQLParser.Query_outputContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#property_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_value(@NotNull SiddhiQLParser.Property_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#month_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth_value(@NotNull SiddhiQLParser.Month_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#output_event_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_event_type(@NotNull SiddhiQLParser.Output_event_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull SiddhiQLParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#store_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStore_input(@NotNull SiddhiQLParser.Store_inputContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#stream_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream_id(@NotNull SiddhiQLParser.Stream_idContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#signed_int_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_int_value(@NotNull SiddhiQLParser.Signed_int_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#function_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_id(@NotNull SiddhiQLParser.Function_idContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin(@NotNull SiddhiQLParser.JoinContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull SiddhiQLParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#per}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPer(@NotNull SiddhiQLParser.PerContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#query_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_input(@NotNull SiddhiQLParser.Query_inputContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#query_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_section(@NotNull SiddhiQLParser.Query_sectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#having}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving(@NotNull SiddhiQLParser.HavingContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#or_math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_math_operation(@NotNull SiddhiQLParser.Or_math_operationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#attribute_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_index(@NotNull SiddhiQLParser.Attribute_indexContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#standard_stateful_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_stateful_source(@NotNull SiddhiQLParser.Standard_stateful_sourceContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#output_rate_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_rate_type(@NotNull SiddhiQLParser.Output_rate_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#group_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by(@NotNull SiddhiQLParser.Group_byContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_window}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_window(@NotNull SiddhiQLParser.Definition_windowContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#pattern_collection_stateful_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_collection_stateful_source(@NotNull SiddhiQLParser.Pattern_collection_stateful_sourceContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#basic_math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_math_operation(@NotNull SiddhiQLParser.Basic_math_operationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#pattern_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_stream(@NotNull SiddhiQLParser.Pattern_streamContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_window_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_window_final(@NotNull SiddhiQLParser.Definition_window_finalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_aggregation_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_aggregation_final(@NotNull SiddhiQLParser.Definition_aggregation_finalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#property_separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_separator(@NotNull SiddhiQLParser.Property_separatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#execution_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecution_element(@NotNull SiddhiQLParser.Execution_elementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#app_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp_annotation(@NotNull SiddhiQLParser.App_annotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#aggregation_time_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation_time_interval(@NotNull SiddhiQLParser.Aggregation_time_intervalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#multiplication_math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication_math_operation(@NotNull SiddhiQLParser.Multiplication_math_operationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#greaterthan_lessthan_math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterthan_lessthan_math_operation(@NotNull SiddhiQLParser.Greaterthan_lessthan_math_operationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#group_by_query_selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_query_selection(@NotNull SiddhiQLParser.Group_by_query_selectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#partition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition(@NotNull SiddhiQLParser.PartitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#addition_math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition_math_operation(@NotNull SiddhiQLParser.Addition_math_operationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#attribute_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_name(@NotNull SiddhiQLParser.Attribute_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(@NotNull SiddhiQLParser.AttributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#attribute_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_reference(@NotNull SiddhiQLParser.Attribute_referenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(@NotNull SiddhiQLParser.EventContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#within_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithin_time(@NotNull SiddhiQLParser.Within_timeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(@NotNull SiddhiQLParser.AnnotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#partition_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_final(@NotNull SiddhiQLParser.Partition_finalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull SiddhiQLParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#every_pattern_source_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvery_pattern_source_chain(@NotNull SiddhiQLParser.Every_pattern_source_chainContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#aggregation_time_duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation_time_duration(@NotNull SiddhiQLParser.Aggregation_time_durationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#minute_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinute_value(@NotNull SiddhiQLParser.Minute_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_function_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_function_final(@NotNull SiddhiQLParser.Definition_function_finalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#aggregation_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation_time(@NotNull SiddhiQLParser.Aggregation_timeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#equality_math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_math_operation(@NotNull SiddhiQLParser.Equality_math_operationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#not_math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_math_operation(@NotNull SiddhiQLParser.Not_math_operationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(@NotNull SiddhiQLParser.FilterContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#second_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond_value(@NotNull SiddhiQLParser.Second_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#anonymous_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_stream(@NotNull SiddhiQLParser.Anonymous_streamContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#attribute_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_list(@NotNull SiddhiQLParser.Attribute_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#sequence_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_source(@NotNull SiddhiQLParser.Sequence_sourceContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#stream_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream_reference(@NotNull SiddhiQLParser.Stream_referenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#language_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguage_name(@NotNull SiddhiQLParser.Language_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#source_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_id(@NotNull SiddhiQLParser.Source_idContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#within_time_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithin_time_range(@NotNull SiddhiQLParser.Within_time_rangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#basic_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_source(@NotNull SiddhiQLParser.Basic_sourceContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#output_rate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_rate(@NotNull SiddhiQLParser.Output_rateContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#bool_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_value(@NotNull SiddhiQLParser.Bool_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(@NotNull SiddhiQLParser.SourceContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#join_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_source(@NotNull SiddhiQLParser.Join_sourceContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#signed_long_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_long_value(@NotNull SiddhiQLParser.Signed_long_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#property_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_name(@NotNull SiddhiQLParser.Property_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#store_query_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStore_query_final(@NotNull SiddhiQLParser.Store_query_finalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#sequence_source_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_source_chain(@NotNull SiddhiQLParser.Sequence_source_chainContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#join_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_stream(@NotNull SiddhiQLParser.Join_streamContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#stream_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream_function(@NotNull SiddhiQLParser.Stream_functionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#week_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeek_value(@NotNull SiddhiQLParser.Week_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_trigger_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_trigger_final(@NotNull SiddhiQLParser.Definition_trigger_finalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(@NotNull SiddhiQLParser.KeywordContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_stream_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_stream_final(@NotNull SiddhiQLParser.Definition_stream_finalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#string_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_value(@NotNull SiddhiQLParser.String_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#pattern_source_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_source_chain(@NotNull SiddhiQLParser.Pattern_source_chainContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#day_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay_value(@NotNull SiddhiQLParser.Day_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(@NotNull SiddhiQLParser.QueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#pattern_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_source(@NotNull SiddhiQLParser.Pattern_sourceContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#time_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_value(@NotNull SiddhiQLParser.Time_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#millisecond_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMillisecond_value(@NotNull SiddhiQLParser.Millisecond_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#standard_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_stream(@NotNull SiddhiQLParser.Standard_streamContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#aggregation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation_name(@NotNull SiddhiQLParser.Aggregation_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#aggregation_time_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation_time_range(@NotNull SiddhiQLParser.Aggregation_time_rangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#constant_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_value(@NotNull SiddhiQLParser.Constant_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#sequence_collection_stateful_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_collection_stateful_source(@NotNull SiddhiQLParser.Sequence_collection_stateful_sourceContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull SiddhiQLParser.NameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#year_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYear_value(@NotNull SiddhiQLParser.Year_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#query_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_final(@NotNull SiddhiQLParser.Query_finalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#store_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStore_query(@NotNull SiddhiQLParser.Store_queryContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_table(@NotNull SiddhiQLParser.Definition_tableContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#collect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect(@NotNull SiddhiQLParser.CollectContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#basic_source_stream_handlers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_source_stream_handlers(@NotNull SiddhiQLParser.Basic_source_stream_handlersContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_function(@NotNull SiddhiQLParser.Definition_functionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(@NotNull SiddhiQLParser.Function_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#partition_with_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_with_stream(@NotNull SiddhiQLParser.Partition_with_streamContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(@NotNull SiddhiQLParser.ErrorContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#sequence_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_stream(@NotNull SiddhiQLParser.Sequence_streamContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(@NotNull SiddhiQLParser.Trigger_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#basic_source_stream_handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_source_stream_handler(@NotNull SiddhiQLParser.Basic_source_stream_handlerContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#annotation_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation_element(@NotNull SiddhiQLParser.Annotation_elementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#in_math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_math_operation(@NotNull SiddhiQLParser.In_math_operationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#signed_float_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_float_value(@NotNull SiddhiQLParser.Signed_float_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#siddhi_app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSiddhi_app(@NotNull SiddhiQLParser.Siddhi_appContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(@NotNull SiddhiQLParser.AliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#and_math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_math_operation(@NotNull SiddhiQLParser.And_math_operationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_trigger(@NotNull SiddhiQLParser.Definition_triggerContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#signed_double_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_double_value(@NotNull SiddhiQLParser.Signed_double_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#condition_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_range(@NotNull SiddhiQLParser.Condition_rangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#null_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_check(@NotNull SiddhiQLParser.Null_checkContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#attribute_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_type(@NotNull SiddhiQLParser.Attribute_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull SiddhiQLParser.ParseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#hour_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHour_value(@NotNull SiddhiQLParser.Hour_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#output_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_attribute(@NotNull SiddhiQLParser.Output_attributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#condition_ranges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_ranges(@NotNull SiddhiQLParser.Condition_rangesContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#function_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_operation(@NotNull SiddhiQLParser.Function_operationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(@NotNull SiddhiQLParser.TargetContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_table_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_table_final(@NotNull SiddhiQLParser.Definition_table_finalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(@NotNull SiddhiQLParser.Function_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#logical_stateful_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_stateful_source(@NotNull SiddhiQLParser.Logical_stateful_sourceContext ctx);

	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#window}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow(@NotNull SiddhiQLParser.WindowContext ctx);
}