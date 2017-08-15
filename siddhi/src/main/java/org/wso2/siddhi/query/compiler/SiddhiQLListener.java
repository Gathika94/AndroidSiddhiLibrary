// Generated from /home/chamath/Projects/AndroidSiddhi/siddhi/src/main/antlr4/org/wso2/siddhi/query/compiler/SiddhiQL.g4 by ANTLR 4.2.2
package org.wso2.siddhi.query.compiler;

	//import org.wso2.siddhi.query.compiler.exception.SiddhiParserException;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SiddhiQLParser}.
 */
public interface SiddhiQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#function_namespace}.
	 * @param ctx the parse tree
	 */
	void enterFunction_namespace(@NotNull SiddhiQLParser.Function_namespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#function_namespace}.
	 * @param ctx the parse tree
	 */
	void exitFunction_namespace(@NotNull SiddhiQLParser.Function_namespaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_stream}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_stream(@NotNull SiddhiQLParser.Definition_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_stream}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_stream(@NotNull SiddhiQLParser.Definition_streamContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_aggregation}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_aggregation(@NotNull SiddhiQLParser.Definition_aggregationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_aggregation}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_aggregation(@NotNull SiddhiQLParser.Definition_aggregationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#query_output}.
	 * @param ctx the parse tree
	 */
	void enterQuery_output(@NotNull SiddhiQLParser.Query_outputContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#query_output}.
	 * @param ctx the parse tree
	 */
	void exitQuery_output(@NotNull SiddhiQLParser.Query_outputContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#property_value}.
	 * @param ctx the parse tree
	 */
	void enterProperty_value(@NotNull SiddhiQLParser.Property_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#property_value}.
	 * @param ctx the parse tree
	 */
	void exitProperty_value(@NotNull SiddhiQLParser.Property_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#month_value}.
	 * @param ctx the parse tree
	 */
	void enterMonth_value(@NotNull SiddhiQLParser.Month_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#month_value}.
	 * @param ctx the parse tree
	 */
	void exitMonth_value(@NotNull SiddhiQLParser.Month_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#output_event_type}.
	 * @param ctx the parse tree
	 */
	void enterOutput_event_type(@NotNull SiddhiQLParser.Output_event_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#output_event_type}.
	 * @param ctx the parse tree
	 */
	void exitOutput_event_type(@NotNull SiddhiQLParser.Output_event_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull SiddhiQLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull SiddhiQLParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#store_input}.
	 * @param ctx the parse tree
	 */
	void enterStore_input(@NotNull SiddhiQLParser.Store_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#store_input}.
	 * @param ctx the parse tree
	 */
	void exitStore_input(@NotNull SiddhiQLParser.Store_inputContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#stream_id}.
	 * @param ctx the parse tree
	 */
	void enterStream_id(@NotNull SiddhiQLParser.Stream_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#stream_id}.
	 * @param ctx the parse tree
	 */
	void exitStream_id(@NotNull SiddhiQLParser.Stream_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#signed_int_value}.
	 * @param ctx the parse tree
	 */
	void enterSigned_int_value(@NotNull SiddhiQLParser.Signed_int_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#signed_int_value}.
	 * @param ctx the parse tree
	 */
	void exitSigned_int_value(@NotNull SiddhiQLParser.Signed_int_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#function_id}.
	 * @param ctx the parse tree
	 */
	void enterFunction_id(@NotNull SiddhiQLParser.Function_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#function_id}.
	 * @param ctx the parse tree
	 */
	void exitFunction_id(@NotNull SiddhiQLParser.Function_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(@NotNull SiddhiQLParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(@NotNull SiddhiQLParser.JoinContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull SiddhiQLParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull SiddhiQLParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#per}.
	 * @param ctx the parse tree
	 */
	void enterPer(@NotNull SiddhiQLParser.PerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#per}.
	 * @param ctx the parse tree
	 */
	void exitPer(@NotNull SiddhiQLParser.PerContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#query_input}.
	 * @param ctx the parse tree
	 */
	void enterQuery_input(@NotNull SiddhiQLParser.Query_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#query_input}.
	 * @param ctx the parse tree
	 */
	void exitQuery_input(@NotNull SiddhiQLParser.Query_inputContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#query_section}.
	 * @param ctx the parse tree
	 */
	void enterQuery_section(@NotNull SiddhiQLParser.Query_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#query_section}.
	 * @param ctx the parse tree
	 */
	void exitQuery_section(@NotNull SiddhiQLParser.Query_sectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#having}.
	 * @param ctx the parse tree
	 */
	void enterHaving(@NotNull SiddhiQLParser.HavingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#having}.
	 * @param ctx the parse tree
	 */
	void exitHaving(@NotNull SiddhiQLParser.HavingContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#or_math_operation}.
	 * @param ctx the parse tree
	 */
	void enterOr_math_operation(@NotNull SiddhiQLParser.Or_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#or_math_operation}.
	 * @param ctx the parse tree
	 */
	void exitOr_math_operation(@NotNull SiddhiQLParser.Or_math_operationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#attribute_index}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_index(@NotNull SiddhiQLParser.Attribute_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#attribute_index}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_index(@NotNull SiddhiQLParser.Attribute_indexContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#standard_stateful_source}.
	 * @param ctx the parse tree
	 */
	void enterStandard_stateful_source(@NotNull SiddhiQLParser.Standard_stateful_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#standard_stateful_source}.
	 * @param ctx the parse tree
	 */
	void exitStandard_stateful_source(@NotNull SiddhiQLParser.Standard_stateful_sourceContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#output_rate_type}.
	 * @param ctx the parse tree
	 */
	void enterOutput_rate_type(@NotNull SiddhiQLParser.Output_rate_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#output_rate_type}.
	 * @param ctx the parse tree
	 */
	void exitOutput_rate_type(@NotNull SiddhiQLParser.Output_rate_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#group_by}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by(@NotNull SiddhiQLParser.Group_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#group_by}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by(@NotNull SiddhiQLParser.Group_byContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_window}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_window(@NotNull SiddhiQLParser.Definition_windowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_window}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_window(@NotNull SiddhiQLParser.Definition_windowContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#pattern_collection_stateful_source}.
	 * @param ctx the parse tree
	 */
	void enterPattern_collection_stateful_source(@NotNull SiddhiQLParser.Pattern_collection_stateful_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#pattern_collection_stateful_source}.
	 * @param ctx the parse tree
	 */
	void exitPattern_collection_stateful_source(@NotNull SiddhiQLParser.Pattern_collection_stateful_sourceContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#basic_math_operation}.
	 * @param ctx the parse tree
	 */
	void enterBasic_math_operation(@NotNull SiddhiQLParser.Basic_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#basic_math_operation}.
	 * @param ctx the parse tree
	 */
	void exitBasic_math_operation(@NotNull SiddhiQLParser.Basic_math_operationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#pattern_stream}.
	 * @param ctx the parse tree
	 */
	void enterPattern_stream(@NotNull SiddhiQLParser.Pattern_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#pattern_stream}.
	 * @param ctx the parse tree
	 */
	void exitPattern_stream(@NotNull SiddhiQLParser.Pattern_streamContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_window_final}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_window_final(@NotNull SiddhiQLParser.Definition_window_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_window_final}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_window_final(@NotNull SiddhiQLParser.Definition_window_finalContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_aggregation_final}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_aggregation_final(@NotNull SiddhiQLParser.Definition_aggregation_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_aggregation_final}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_aggregation_final(@NotNull SiddhiQLParser.Definition_aggregation_finalContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#property_separator}.
	 * @param ctx the parse tree
	 */
	void enterProperty_separator(@NotNull SiddhiQLParser.Property_separatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#property_separator}.
	 * @param ctx the parse tree
	 */
	void exitProperty_separator(@NotNull SiddhiQLParser.Property_separatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#execution_element}.
	 * @param ctx the parse tree
	 */
	void enterExecution_element(@NotNull SiddhiQLParser.Execution_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#execution_element}.
	 * @param ctx the parse tree
	 */
	void exitExecution_element(@NotNull SiddhiQLParser.Execution_elementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#app_annotation}.
	 * @param ctx the parse tree
	 */
	void enterApp_annotation(@NotNull SiddhiQLParser.App_annotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#app_annotation}.
	 * @param ctx the parse tree
	 */
	void exitApp_annotation(@NotNull SiddhiQLParser.App_annotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#aggregation_time_interval}.
	 * @param ctx the parse tree
	 */
	void enterAggregation_time_interval(@NotNull SiddhiQLParser.Aggregation_time_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#aggregation_time_interval}.
	 * @param ctx the parse tree
	 */
	void exitAggregation_time_interval(@NotNull SiddhiQLParser.Aggregation_time_intervalContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#multiplication_math_operation}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication_math_operation(@NotNull SiddhiQLParser.Multiplication_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#multiplication_math_operation}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication_math_operation(@NotNull SiddhiQLParser.Multiplication_math_operationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#greaterthan_lessthan_math_operation}.
	 * @param ctx the parse tree
	 */
	void enterGreaterthan_lessthan_math_operation(@NotNull SiddhiQLParser.Greaterthan_lessthan_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#greaterthan_lessthan_math_operation}.
	 * @param ctx the parse tree
	 */
	void exitGreaterthan_lessthan_math_operation(@NotNull SiddhiQLParser.Greaterthan_lessthan_math_operationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#group_by_query_selection}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_query_selection(@NotNull SiddhiQLParser.Group_by_query_selectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#group_by_query_selection}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_query_selection(@NotNull SiddhiQLParser.Group_by_query_selectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#partition}.
	 * @param ctx the parse tree
	 */
	void enterPartition(@NotNull SiddhiQLParser.PartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#partition}.
	 * @param ctx the parse tree
	 */
	void exitPartition(@NotNull SiddhiQLParser.PartitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#addition_math_operation}.
	 * @param ctx the parse tree
	 */
	void enterAddition_math_operation(@NotNull SiddhiQLParser.Addition_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#addition_math_operation}.
	 * @param ctx the parse tree
	 */
	void exitAddition_math_operation(@NotNull SiddhiQLParser.Addition_math_operationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(@NotNull SiddhiQLParser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(@NotNull SiddhiQLParser.Attribute_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull SiddhiQLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull SiddhiQLParser.AttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#attribute_reference}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_reference(@NotNull SiddhiQLParser.Attribute_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#attribute_reference}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_reference(@NotNull SiddhiQLParser.Attribute_referenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(@NotNull SiddhiQLParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(@NotNull SiddhiQLParser.EventContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#within_time}.
	 * @param ctx the parse tree
	 */
	void enterWithin_time(@NotNull SiddhiQLParser.Within_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#within_time}.
	 * @param ctx the parse tree
	 */
	void exitWithin_time(@NotNull SiddhiQLParser.Within_timeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull SiddhiQLParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull SiddhiQLParser.AnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#partition_final}.
	 * @param ctx the parse tree
	 */
	void enterPartition_final(@NotNull SiddhiQLParser.Partition_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#partition_final}.
	 * @param ctx the parse tree
	 */
	void exitPartition_final(@NotNull SiddhiQLParser.Partition_finalContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull SiddhiQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull SiddhiQLParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#every_pattern_source_chain}.
	 * @param ctx the parse tree
	 */
	void enterEvery_pattern_source_chain(@NotNull SiddhiQLParser.Every_pattern_source_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#every_pattern_source_chain}.
	 * @param ctx the parse tree
	 */
	void exitEvery_pattern_source_chain(@NotNull SiddhiQLParser.Every_pattern_source_chainContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#aggregation_time_duration}.
	 * @param ctx the parse tree
	 */
	void enterAggregation_time_duration(@NotNull SiddhiQLParser.Aggregation_time_durationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#aggregation_time_duration}.
	 * @param ctx the parse tree
	 */
	void exitAggregation_time_duration(@NotNull SiddhiQLParser.Aggregation_time_durationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#minute_value}.
	 * @param ctx the parse tree
	 */
	void enterMinute_value(@NotNull SiddhiQLParser.Minute_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#minute_value}.
	 * @param ctx the parse tree
	 */
	void exitMinute_value(@NotNull SiddhiQLParser.Minute_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_function_final}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_function_final(@NotNull SiddhiQLParser.Definition_function_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_function_final}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_function_final(@NotNull SiddhiQLParser.Definition_function_finalContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#aggregation_time}.
	 * @param ctx the parse tree
	 */
	void enterAggregation_time(@NotNull SiddhiQLParser.Aggregation_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#aggregation_time}.
	 * @param ctx the parse tree
	 */
	void exitAggregation_time(@NotNull SiddhiQLParser.Aggregation_timeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#equality_math_operation}.
	 * @param ctx the parse tree
	 */
	void enterEquality_math_operation(@NotNull SiddhiQLParser.Equality_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#equality_math_operation}.
	 * @param ctx the parse tree
	 */
	void exitEquality_math_operation(@NotNull SiddhiQLParser.Equality_math_operationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#not_math_operation}.
	 * @param ctx the parse tree
	 */
	void enterNot_math_operation(@NotNull SiddhiQLParser.Not_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#not_math_operation}.
	 * @param ctx the parse tree
	 */
	void exitNot_math_operation(@NotNull SiddhiQLParser.Not_math_operationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(@NotNull SiddhiQLParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(@NotNull SiddhiQLParser.FilterContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#second_value}.
	 * @param ctx the parse tree
	 */
	void enterSecond_value(@NotNull SiddhiQLParser.Second_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#second_value}.
	 * @param ctx the parse tree
	 */
	void exitSecond_value(@NotNull SiddhiQLParser.Second_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#anonymous_stream}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_stream(@NotNull SiddhiQLParser.Anonymous_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#anonymous_stream}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_stream(@NotNull SiddhiQLParser.Anonymous_streamContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_list(@NotNull SiddhiQLParser.Attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_list(@NotNull SiddhiQLParser.Attribute_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#sequence_source}.
	 * @param ctx the parse tree
	 */
	void enterSequence_source(@NotNull SiddhiQLParser.Sequence_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#sequence_source}.
	 * @param ctx the parse tree
	 */
	void exitSequence_source(@NotNull SiddhiQLParser.Sequence_sourceContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#stream_reference}.
	 * @param ctx the parse tree
	 */
	void enterStream_reference(@NotNull SiddhiQLParser.Stream_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#stream_reference}.
	 * @param ctx the parse tree
	 */
	void exitStream_reference(@NotNull SiddhiQLParser.Stream_referenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#language_name}.
	 * @param ctx the parse tree
	 */
	void enterLanguage_name(@NotNull SiddhiQLParser.Language_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#language_name}.
	 * @param ctx the parse tree
	 */
	void exitLanguage_name(@NotNull SiddhiQLParser.Language_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#source_id}.
	 * @param ctx the parse tree
	 */
	void enterSource_id(@NotNull SiddhiQLParser.Source_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#source_id}.
	 * @param ctx the parse tree
	 */
	void exitSource_id(@NotNull SiddhiQLParser.Source_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#within_time_range}.
	 * @param ctx the parse tree
	 */
	void enterWithin_time_range(@NotNull SiddhiQLParser.Within_time_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#within_time_range}.
	 * @param ctx the parse tree
	 */
	void exitWithin_time_range(@NotNull SiddhiQLParser.Within_time_rangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#basic_source}.
	 * @param ctx the parse tree
	 */
	void enterBasic_source(@NotNull SiddhiQLParser.Basic_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#basic_source}.
	 * @param ctx the parse tree
	 */
	void exitBasic_source(@NotNull SiddhiQLParser.Basic_sourceContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#output_rate}.
	 * @param ctx the parse tree
	 */
	void enterOutput_rate(@NotNull SiddhiQLParser.Output_rateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#output_rate}.
	 * @param ctx the parse tree
	 */
	void exitOutput_rate(@NotNull SiddhiQLParser.Output_rateContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#bool_value}.
	 * @param ctx the parse tree
	 */
	void enterBool_value(@NotNull SiddhiQLParser.Bool_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#bool_value}.
	 * @param ctx the parse tree
	 */
	void exitBool_value(@NotNull SiddhiQLParser.Bool_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(@NotNull SiddhiQLParser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(@NotNull SiddhiQLParser.SourceContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#join_source}.
	 * @param ctx the parse tree
	 */
	void enterJoin_source(@NotNull SiddhiQLParser.Join_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#join_source}.
	 * @param ctx the parse tree
	 */
	void exitJoin_source(@NotNull SiddhiQLParser.Join_sourceContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#signed_long_value}.
	 * @param ctx the parse tree
	 */
	void enterSigned_long_value(@NotNull SiddhiQLParser.Signed_long_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#signed_long_value}.
	 * @param ctx the parse tree
	 */
	void exitSigned_long_value(@NotNull SiddhiQLParser.Signed_long_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#property_name}.
	 * @param ctx the parse tree
	 */
	void enterProperty_name(@NotNull SiddhiQLParser.Property_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#property_name}.
	 * @param ctx the parse tree
	 */
	void exitProperty_name(@NotNull SiddhiQLParser.Property_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#store_query_final}.
	 * @param ctx the parse tree
	 */
	void enterStore_query_final(@NotNull SiddhiQLParser.Store_query_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#store_query_final}.
	 * @param ctx the parse tree
	 */
	void exitStore_query_final(@NotNull SiddhiQLParser.Store_query_finalContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#sequence_source_chain}.
	 * @param ctx the parse tree
	 */
	void enterSequence_source_chain(@NotNull SiddhiQLParser.Sequence_source_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#sequence_source_chain}.
	 * @param ctx the parse tree
	 */
	void exitSequence_source_chain(@NotNull SiddhiQLParser.Sequence_source_chainContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#join_stream}.
	 * @param ctx the parse tree
	 */
	void enterJoin_stream(@NotNull SiddhiQLParser.Join_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#join_stream}.
	 * @param ctx the parse tree
	 */
	void exitJoin_stream(@NotNull SiddhiQLParser.Join_streamContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#stream_function}.
	 * @param ctx the parse tree
	 */
	void enterStream_function(@NotNull SiddhiQLParser.Stream_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#stream_function}.
	 * @param ctx the parse tree
	 */
	void exitStream_function(@NotNull SiddhiQLParser.Stream_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#week_value}.
	 * @param ctx the parse tree
	 */
	void enterWeek_value(@NotNull SiddhiQLParser.Week_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#week_value}.
	 * @param ctx the parse tree
	 */
	void exitWeek_value(@NotNull SiddhiQLParser.Week_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_trigger_final}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_trigger_final(@NotNull SiddhiQLParser.Definition_trigger_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_trigger_final}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_trigger_final(@NotNull SiddhiQLParser.Definition_trigger_finalContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(@NotNull SiddhiQLParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(@NotNull SiddhiQLParser.KeywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_stream_final}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_stream_final(@NotNull SiddhiQLParser.Definition_stream_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_stream_final}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_stream_final(@NotNull SiddhiQLParser.Definition_stream_finalContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#string_value}.
	 * @param ctx the parse tree
	 */
	void enterString_value(@NotNull SiddhiQLParser.String_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#string_value}.
	 * @param ctx the parse tree
	 */
	void exitString_value(@NotNull SiddhiQLParser.String_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#pattern_source_chain}.
	 * @param ctx the parse tree
	 */
	void enterPattern_source_chain(@NotNull SiddhiQLParser.Pattern_source_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#pattern_source_chain}.
	 * @param ctx the parse tree
	 */
	void exitPattern_source_chain(@NotNull SiddhiQLParser.Pattern_source_chainContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#day_value}.
	 * @param ctx the parse tree
	 */
	void enterDay_value(@NotNull SiddhiQLParser.Day_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#day_value}.
	 * @param ctx the parse tree
	 */
	void exitDay_value(@NotNull SiddhiQLParser.Day_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(@NotNull SiddhiQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(@NotNull SiddhiQLParser.QueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#pattern_source}.
	 * @param ctx the parse tree
	 */
	void enterPattern_source(@NotNull SiddhiQLParser.Pattern_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#pattern_source}.
	 * @param ctx the parse tree
	 */
	void exitPattern_source(@NotNull SiddhiQLParser.Pattern_sourceContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#time_value}.
	 * @param ctx the parse tree
	 */
	void enterTime_value(@NotNull SiddhiQLParser.Time_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#time_value}.
	 * @param ctx the parse tree
	 */
	void exitTime_value(@NotNull SiddhiQLParser.Time_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#millisecond_value}.
	 * @param ctx the parse tree
	 */
	void enterMillisecond_value(@NotNull SiddhiQLParser.Millisecond_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#millisecond_value}.
	 * @param ctx the parse tree
	 */
	void exitMillisecond_value(@NotNull SiddhiQLParser.Millisecond_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#standard_stream}.
	 * @param ctx the parse tree
	 */
	void enterStandard_stream(@NotNull SiddhiQLParser.Standard_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#standard_stream}.
	 * @param ctx the parse tree
	 */
	void exitStandard_stream(@NotNull SiddhiQLParser.Standard_streamContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#aggregation_name}.
	 * @param ctx the parse tree
	 */
	void enterAggregation_name(@NotNull SiddhiQLParser.Aggregation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#aggregation_name}.
	 * @param ctx the parse tree
	 */
	void exitAggregation_name(@NotNull SiddhiQLParser.Aggregation_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#aggregation_time_range}.
	 * @param ctx the parse tree
	 */
	void enterAggregation_time_range(@NotNull SiddhiQLParser.Aggregation_time_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#aggregation_time_range}.
	 * @param ctx the parse tree
	 */
	void exitAggregation_time_range(@NotNull SiddhiQLParser.Aggregation_time_rangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#constant_value}.
	 * @param ctx the parse tree
	 */
	void enterConstant_value(@NotNull SiddhiQLParser.Constant_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#constant_value}.
	 * @param ctx the parse tree
	 */
	void exitConstant_value(@NotNull SiddhiQLParser.Constant_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#sequence_collection_stateful_source}.
	 * @param ctx the parse tree
	 */
	void enterSequence_collection_stateful_source(@NotNull SiddhiQLParser.Sequence_collection_stateful_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#sequence_collection_stateful_source}.
	 * @param ctx the parse tree
	 */
	void exitSequence_collection_stateful_source(@NotNull SiddhiQLParser.Sequence_collection_stateful_sourceContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull SiddhiQLParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull SiddhiQLParser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#year_value}.
	 * @param ctx the parse tree
	 */
	void enterYear_value(@NotNull SiddhiQLParser.Year_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#year_value}.
	 * @param ctx the parse tree
	 */
	void exitYear_value(@NotNull SiddhiQLParser.Year_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#query_final}.
	 * @param ctx the parse tree
	 */
	void enterQuery_final(@NotNull SiddhiQLParser.Query_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#query_final}.
	 * @param ctx the parse tree
	 */
	void exitQuery_final(@NotNull SiddhiQLParser.Query_finalContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#store_query}.
	 * @param ctx the parse tree
	 */
	void enterStore_query(@NotNull SiddhiQLParser.Store_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#store_query}.
	 * @param ctx the parse tree
	 */
	void exitStore_query(@NotNull SiddhiQLParser.Store_queryContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_table}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_table(@NotNull SiddhiQLParser.Definition_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_table}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_table(@NotNull SiddhiQLParser.Definition_tableContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#collect}.
	 * @param ctx the parse tree
	 */
	void enterCollect(@NotNull SiddhiQLParser.CollectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#collect}.
	 * @param ctx the parse tree
	 */
	void exitCollect(@NotNull SiddhiQLParser.CollectContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#basic_source_stream_handlers}.
	 * @param ctx the parse tree
	 */
	void enterBasic_source_stream_handlers(@NotNull SiddhiQLParser.Basic_source_stream_handlersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#basic_source_stream_handlers}.
	 * @param ctx the parse tree
	 */
	void exitBasic_source_stream_handlers(@NotNull SiddhiQLParser.Basic_source_stream_handlersContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_function}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_function(@NotNull SiddhiQLParser.Definition_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_function}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_function(@NotNull SiddhiQLParser.Definition_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(@NotNull SiddhiQLParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(@NotNull SiddhiQLParser.Function_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#partition_with_stream}.
	 * @param ctx the parse tree
	 */
	void enterPartition_with_stream(@NotNull SiddhiQLParser.Partition_with_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#partition_with_stream}.
	 * @param ctx the parse tree
	 */
	void exitPartition_with_stream(@NotNull SiddhiQLParser.Partition_with_streamContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(@NotNull SiddhiQLParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(@NotNull SiddhiQLParser.ErrorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#sequence_stream}.
	 * @param ctx the parse tree
	 */
	void enterSequence_stream(@NotNull SiddhiQLParser.Sequence_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#sequence_stream}.
	 * @param ctx the parse tree
	 */
	void exitSequence_stream(@NotNull SiddhiQLParser.Sequence_streamContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(@NotNull SiddhiQLParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(@NotNull SiddhiQLParser.Trigger_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#basic_source_stream_handler}.
	 * @param ctx the parse tree
	 */
	void enterBasic_source_stream_handler(@NotNull SiddhiQLParser.Basic_source_stream_handlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#basic_source_stream_handler}.
	 * @param ctx the parse tree
	 */
	void exitBasic_source_stream_handler(@NotNull SiddhiQLParser.Basic_source_stream_handlerContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#annotation_element}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation_element(@NotNull SiddhiQLParser.Annotation_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#annotation_element}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation_element(@NotNull SiddhiQLParser.Annotation_elementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#in_math_operation}.
	 * @param ctx the parse tree
	 */
	void enterIn_math_operation(@NotNull SiddhiQLParser.In_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#in_math_operation}.
	 * @param ctx the parse tree
	 */
	void exitIn_math_operation(@NotNull SiddhiQLParser.In_math_operationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#signed_float_value}.
	 * @param ctx the parse tree
	 */
	void enterSigned_float_value(@NotNull SiddhiQLParser.Signed_float_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#signed_float_value}.
	 * @param ctx the parse tree
	 */
	void exitSigned_float_value(@NotNull SiddhiQLParser.Signed_float_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#siddhi_app}.
	 * @param ctx the parse tree
	 */
	void enterSiddhi_app(@NotNull SiddhiQLParser.Siddhi_appContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#siddhi_app}.
	 * @param ctx the parse tree
	 */
	void exitSiddhi_app(@NotNull SiddhiQLParser.Siddhi_appContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(@NotNull SiddhiQLParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(@NotNull SiddhiQLParser.AliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#and_math_operation}.
	 * @param ctx the parse tree
	 */
	void enterAnd_math_operation(@NotNull SiddhiQLParser.And_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#and_math_operation}.
	 * @param ctx the parse tree
	 */
	void exitAnd_math_operation(@NotNull SiddhiQLParser.And_math_operationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_trigger(@NotNull SiddhiQLParser.Definition_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_trigger(@NotNull SiddhiQLParser.Definition_triggerContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#signed_double_value}.
	 * @param ctx the parse tree
	 */
	void enterSigned_double_value(@NotNull SiddhiQLParser.Signed_double_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#signed_double_value}.
	 * @param ctx the parse tree
	 */
	void exitSigned_double_value(@NotNull SiddhiQLParser.Signed_double_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#condition_range}.
	 * @param ctx the parse tree
	 */
	void enterCondition_range(@NotNull SiddhiQLParser.Condition_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#condition_range}.
	 * @param ctx the parse tree
	 */
	void exitCondition_range(@NotNull SiddhiQLParser.Condition_rangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#null_check}.
	 * @param ctx the parse tree
	 */
	void enterNull_check(@NotNull SiddhiQLParser.Null_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#null_check}.
	 * @param ctx the parse tree
	 */
	void exitNull_check(@NotNull SiddhiQLParser.Null_checkContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#attribute_type}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_type(@NotNull SiddhiQLParser.Attribute_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#attribute_type}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_type(@NotNull SiddhiQLParser.Attribute_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull SiddhiQLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull SiddhiQLParser.ParseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#hour_value}.
	 * @param ctx the parse tree
	 */
	void enterHour_value(@NotNull SiddhiQLParser.Hour_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#hour_value}.
	 * @param ctx the parse tree
	 */
	void exitHour_value(@NotNull SiddhiQLParser.Hour_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#output_attribute}.
	 * @param ctx the parse tree
	 */
	void enterOutput_attribute(@NotNull SiddhiQLParser.Output_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#output_attribute}.
	 * @param ctx the parse tree
	 */
	void exitOutput_attribute(@NotNull SiddhiQLParser.Output_attributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#condition_ranges}.
	 * @param ctx the parse tree
	 */
	void enterCondition_ranges(@NotNull SiddhiQLParser.Condition_rangesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#condition_ranges}.
	 * @param ctx the parse tree
	 */
	void exitCondition_ranges(@NotNull SiddhiQLParser.Condition_rangesContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#function_operation}.
	 * @param ctx the parse tree
	 */
	void enterFunction_operation(@NotNull SiddhiQLParser.Function_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#function_operation}.
	 * @param ctx the parse tree
	 */
	void exitFunction_operation(@NotNull SiddhiQLParser.Function_operationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(@NotNull SiddhiQLParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(@NotNull SiddhiQLParser.TargetContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_table_final}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_table_final(@NotNull SiddhiQLParser.Definition_table_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_table_final}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_table_final(@NotNull SiddhiQLParser.Definition_table_finalContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(@NotNull SiddhiQLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(@NotNull SiddhiQLParser.Function_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#logical_stateful_source}.
	 * @param ctx the parse tree
	 */
	void enterLogical_stateful_source(@NotNull SiddhiQLParser.Logical_stateful_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#logical_stateful_source}.
	 * @param ctx the parse tree
	 */
	void exitLogical_stateful_source(@NotNull SiddhiQLParser.Logical_stateful_sourceContext ctx);

	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#window}.
	 * @param ctx the parse tree
	 */
	void enterWindow(@NotNull SiddhiQLParser.WindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#window}.
	 * @param ctx the parse tree
	 */
	void exitWindow(@NotNull SiddhiQLParser.WindowContext ctx);
}