;; http://www.4clojure.com/problem/8

;; Intro to Sets
;; Sets are collections of unique values.

;; (= ___ (set '(:a :a :b :c :c :c :d :d)))
;; (= ___ (clojure.set/union #{:a :b :c} #{:b :c :d}))

;; Answer:
;; #{:a :b :c :d}

;; Output:
(= #{:a :b :c :d} (set '(:a :a :b :c :c :c :d :d)))
(= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d}))

;; Explanation:
;; By definition, sets are collections of _unique_ numbers.
;; The first example creates a set with various elements duplicated.
;; The resulting set will only contain one instance of each of the
;; duplicate values.
;; The second example uses the union function from the clojure.set
;; namespace (see http://clojuredocs.org/clojure_core/clojure.set).
;; clojure.set/union takes two sets and returns the union of the sets.
;; By definition, values that appear in more than one of the original
;; sets will only appear once in the resulting set.
