;; http://www.4clojure.com/problem/18

;; Sequences: filter
;; The filter function takes two arguments: a predicate function (f) and a sequence (s). Filter returns a new sequence consisting of all the items of s for which (f item) returns true.

;; (= __ (filter #(> % 5) '(3 4 5 6 7)))

;; Answer:
;; '(6 7)

;; Output:
(= '(6 7) (filter #(> % 5) '(3 4 5 6 7)))

;; Explanation:
;; The function passed to filter is an anonymous function that takes a
;; single argument and retuns true if the value is greater than 5.
;; The resulting list contains element 6 and 7, which are the elements
;; from the provided list that meet the conditions of the predicate function.

