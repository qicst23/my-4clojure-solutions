;; http://www.4clojure.com/problem/2

;; Simple Math
;; If you are not familiar with polish notation, simple arithmetic might seem confusing.

;; (= (- 10 (* 2 3)) _)

;; Answer:
;; 4

;; Output:
(= (- 10 (* 2 3)) 4)

;; Explanation:
;; The innermost expression (* 2 3) evaluates to 6.
;; The outermost is the result of (- 10 6), or 10 - 6, which is 4.
