# Reproducer for PMD running rules twice

When configuring a custom ruleset in task "pmdMain", then the default ruleset "category/java/errorprone.xml"
is run.

It outputs this:

```
./gradlew check
.../gradle-issue-reproducer-pmd-custom-ruleset/src/main/java/org/example/App.java:6:       AssignmentToNonFinalStatic:     Possible unsafe assignment to non-final static field 'x' in a constructor.
.../gradle-issue-reproducer-pmd-custom-ruleset/src/main/java/org/example/App.java:6:       AssignmentToNonFinalStatic:     Possible unsafe assignment to non-final static field 'x' in a constructor.
> Task :pmdMain FAILED
```

The rule is executed twice, once from the default ruleset property and once from the custom ruleset.
It should only be executed once.
