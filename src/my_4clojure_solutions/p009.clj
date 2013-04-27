;; http://www.4clojure.com/problem/9

;; Sets: conj
;; When operating on a set, the conj function returns a new set with one or more keys "added".

;; (= #{1 2 3 4} (conj #{1 4 3} ___))

;; Answer:
;; 2

;; Output
(= #{1 2 3 4} (conj #{1 4 3} 2))

;; Explanation:
;; In a list, conj "adds" the new element(s) to the front of the list.
;; In a vector, conj "adds" the new element(s) to the end of the vector.
;; In a set, conj simply "adds" the new element(s) to the set.
;; The set is returned with its elements sorted.
