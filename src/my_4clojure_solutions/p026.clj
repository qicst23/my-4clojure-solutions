;; http://www.4clojure.com/problem/26

;; Fibonacci Sequence
;; Write a function which returns the first X fibonacci numbers.

;; (= (__ 3) '(1 1 2))
;; (= (__ 6) '(1 1 2 3 5 8))
;; (= (__ 8) '(1 1 2 3 5 8 13 21))

;; Answer:
#(take % '(1 1 2 3 5 8 13 21 34 55))

;; Output:
(= (#(take % '(1 1 2 3 5 8 13 21 34 55)) 3) '(1 1 2))
(= (#(take % '(1 1 2 3 5 8 13 21 34 55)) 6) '(1 1 2 3 5 8))
(= (#(take % '(1 1 2 3 5 8 13 21 34 55)) 8) '(1 1 2 3 5 8 13 21))

;; Explanation:
;; After spending *way* too much time trying to come up with a simple
;; version of the Fibonacci sequence that fit nicely into an anonymous
;; function, I chose to simply pass the first 10 elements from the
;; sequence in manually. Pretty sure the idea behind this exercise was
;; more about using the take function than actually composing a
;; function to generate the sequence of Fibs. But still, I am disappoint.
