package org.glenlivet.resolver;

public class TaggingTaskServiceImpl implements TaggingTaskService {

    private Resolver<TaggingTask, ResolvableValidator<TaggingTask, Corpus>> corpusValidatorResolver;

    public Resolver<TaggingTask, ResolvableValidator<TaggingTask, Corpus>> getCorpusValidatorResolver() {
        return corpusValidatorResolver;
    }

    public void setCorpusValidatorResolver(Resolver<TaggingTask, ResolvableValidator<TaggingTask, Corpus>> corpusValidatorResolver) {
        this.corpusValidatorResolver = corpusValidatorResolver;
    }
}
