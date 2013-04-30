;; http://www.4clojure.com/problem/24

;; Sum It All Up
;; Write a function which returns the sum of a sequence of numbers.

;; (= (__ [1 2 3]) 6)
;; (= (__ (list 0 -2 5 5)) 8)
;; (= (__ #{4 2 1}) 7)
;; (= (__ '(0 0 -1)) -1)
;; (= (__ '(1 10 3)) 14)

;; Answer:
#(reduce + %)

;; Output:
(= (#(reduce + %) [1 2 3]) 6)
(= (#(reduce + %) (list 0 -2 5 5)) 8)
(= (#(reduce + %) #{4 2 1}) 7)
(= (#(reduce + %) '(0 0 -1)) -1)
(= (#(reduce + %) '(1 10 3)) 14)

;; Explanation:
;; After struggling a bit with the last few questions, this one was a
;; breath of fresh air. My first thought was to use #(apply + %),
;; which also works fine. But I think #(reduce + %) is more idiomatic?

;; Discuss.
