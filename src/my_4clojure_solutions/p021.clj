;; http://www.4clojure.com/problem/21

;; Nth Element
;; Write a function which returns the Nth element from a sequence.

;; Special Restrictions:
;; nth

;; (= (__ '(4 5 6 7) 2) 6)
;; (= (__ [:a :b :c] 0) :a)
;; (= (__ [1 2 3 4] 1) 2)
;; (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])

;; Answer:
;; 

;; Output:
(= ((fn [coll n] (if (zero? n) (first coll) (recur (rest coll) (- n 1)))) '(4 5 6 7) 2) )
(= ((fn [coll n] (if (zero? n) (first coll) (recur (rest coll) (- n 1)))) [:a :b :c] 0) :a)
(= ((fn [coll n] (if (zero? n) (first coll) (recur (rest coll) (- n 1)))) [1 2 3 4] 1) 2)
(= ((fn [coll n] (if (zero? n) (first coll) (recur (rest coll) (- n 1)))) '([1 2] [3 4] [5 6]) 2) [5 6])

;; Explanation:
;; This will likely end up being a "you could also have done...", as
;; I'm fairly certain this solution is more complex than what the
;; 4Clojure folks are looking for.
