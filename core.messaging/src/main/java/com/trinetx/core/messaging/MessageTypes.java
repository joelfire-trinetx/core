package com.trinetx.core.messaging;

public final class MessageTypes {
    
    public class TERM_SERVER {
        public static final String COMMAND = "command";
        public static final String TERM_RESOURCE = "term_resource";
        public static final String TERM_COUNT_RESOURCE = "term_count_resource";
        public static final String AGE_VALUES_RESOURCE = "age_values_resource";
        public static final String AGE_COUNTS_RESOURCE = "age_counts_resource";
        public static final String CONCEPT_HIERARCHY_RESOURCE = "concept_hierarchy_resource";
        public static final String CONCEPT_HIERARCHY_CHILDREN_RESOURCE = "concept_hierarchy_children_resource";
        public static final String CONCEPT_COUNTS_RESOURCE = "concept_counts_resource";
        public static final String LAB_VALUES_RESOURCE = "lab_values_resource";
        public static final String PROVIDER_COUNTS_RESOURCE = "provider_counts_resource";
        public static final String CATEGORY_AND_NAME_RESOURCE = "category_and_name_resource";
        public static final String CONCEPT_VALUES_RESOURCE = "concept_values_resource";
        public static final String CONCEPT_VALUES_CHILDREN_RESOURCE = "concept_values_children_resource";

        // TODO: move to TSParam once it is move out of pubsub
        public class TSParam {
            public static final String CONCEPT_COUNTS_REQUEST = "concept_counts_request"; 
            public static final String CATEGORY_AND_NAME_TERMS = "category_and_name_terms"; 
            public static final String AGE_GENDER_QUALIFIER = "ageGenderQualifier";
            public static final String PROVIDER_SUPPORT_FOR_QUALIFICATION = "providerSupport";
            public static final String EXPORT = "export";
        }
    }
    
}
