package org.glenlivet.resolver;

public class ApplicationConfiguration {

    public Resolver<TaggingTask, ResolvableValidator<TaggingTask, Corpus>> validatorResolver() {
        Resolver resolver = new ResolverImpl();
        //add 1st validator, from a sub module jar maybe
        resolver.addObject(new ResolvableValidator() {
            public Boolean support(Object type) {
                return null;
            }

            public Boolean validate(Object object) {
                return null;
            }
        });
        //add 2nd validator, from another sub module jar maybe
        resolver.addObject(new ResolvableValidator() {
            public Boolean support(Object type) {
                return null;
            }

            public Boolean validate(Object object) {
                return null;
            }
        });
        return resolver;
    }

    public TaggingTaskService taggingTaskService() {
        TaggingTaskService tts = new TaggingTaskServiceImpl();
        ((TaggingTaskServiceImpl) tts).setCorpusValidatorResolver(validatorResolver());
        return tts;
    }
}
