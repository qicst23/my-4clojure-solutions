;; http://www.4clojure.com/problem/23

;; Reverse a Sequence
;; Write a function which reverses a sequence.

;; Special Restrictions:
;; reverse
;; rseq

;; (= (__ [1 2 3 4 5]) [5 4 3 2 1])
;; (= (__ (sorted-set 5 7 2 7)) '(7 5 2))
;; (= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

;; Answer:


;; Output:
(= (__ [1 2 3 4 5]) [5 4 3 2 1])
(= (__ (sorted-set 5 7 2 7)) '(7 5 2))
(= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

;; Explanation:
;; Started off with #(repeatedly (count %) (cons (last %) %)), but
;; kept getting ClassCastException [trace missing] exceptions. I
;; believe that has to do with the transient way I was trying to use
;; the collection within the anonymous function. conj has a conj! that
;; will work, but it's alpha. In any event, cons has no such
;; corresponding function. Still working on this one.

