package org.glenlivet.resolver;

public interface TaggingTaskService {

    Resolver<TaggingTask, ResolvableValidator<TaggingTask, Corpus>> getCorpusValidatorResolver();
}
