;; http://www.4clojure.com/problem/7

;; Vectors: conj
;; When operating on a Vector, the conj function will return a new vector with one or more items "added" to the end.

;; (= ___ (conj [1 2 3] 4))
;; (= ___ (conj [1 2] 3 4))

;; Answer:
;; [1 2 3 4]

;; Output:
(= [1 2 3 4] (conj [1 2 3] 4))
(= [1 2 3 4] (conj [1 2] 3 4))

;; Explanation:
;; Very similar to problem 5, using conj on lists.
;; The difference is that on a list, conj "adds" the element(s) to the
;; front of the list. With vectors, conj "addes" the element(s) to the
;; _end_ of the vector.
