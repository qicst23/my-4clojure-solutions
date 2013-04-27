;; http://www.4clojure.com/problem/14

;; Intro to Functions
;; Clojure has many different ways to create functions.

;; (= __ ((fn add-five [x] (+ x 5)) 3))
;; (= __ ((fn [x] (+ x 5)) 3))
;; (= __ (#(+ % 5) 3))
;; (= __ ((partial + 5) 3))

;; Answer:
;; 8

;; Output:
(= 8 ((fn add-five [x] (+ x 5)) 3))
(= 8 ((fn [x] (+ x 5)) 3))
(= 8 (#(+ % 5) 3))
(= 8 ((partial + 5) 3))

;; Explanation:
;; Simple demonstration of various ways to create a function that
;; takes one argument and adds 3 to that argument.
