;; http://www.4clojure.com/problem/5

;; Lists: conj
;; When operating on a list, the conj function will return a new list with one or more items "added" to the front.

;; (= __ (conj '(2 3 4) 1))
;; (= __ (conj '(3 4) 2 1))

;; Answer:
;; '(1 2 3 4)

;; Output:
(= '(1 2 3 4) (conj '(2 3 4) 1))
(= '(1 2 3 4) (conj '(3 4) 2 1))

;; Explanation:
;; In the first problem, 1 is conj'd onto the beginning of list '(2 3 4)
;; In the second problem, first 2 is conj'd onto the beginning of list
;; '(3 4), resulting in list '(2 3 4). Then 1 is conj'd onto that result.
