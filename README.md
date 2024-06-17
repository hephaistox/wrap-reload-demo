# ring-app

Based on example of ring code in "Web Development with Clojure Third Edition", as in page 37, this repo demonstrates how aliased namespace litteral maps are messing up `ring/wrap-reload`.

When the error is demonstrated the code does not pass wrap-reload, 

So:

* Branch `main` makes it fail:

``` log
130 -> lein run
SLF4J: No SLF4J providers were found.
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See https://www.slf4j.org/codes.html#noProviders for further details.
Execution error (AssertionError) at ns-tracker.dependency/depend (dependency.clj:56).
Assert failed: circular dependency
(not (depends? graph dep x))

Full report at:
/var/folders/fz/zf0944w113b5pj984_ywtb1m0000gn/T/clojure-13192220538057578899.edn;
```

File [clojure-13192220538057578899.edn](clojure-13192220538057578899.edn) is included in the repo

* Branch `without-as-alias` has removed the as-alias and then circular dependency.
