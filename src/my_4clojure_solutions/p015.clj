;; http://www.4clojure.com/problem/15

;; Double Down
;; Write a function which doubles a number.

;; (= (__ 2) 4)
;; (= (__ 3) 6)
;; (= (__ 11) 22)
;; (= (__ 7) 14)

;; Answer:
;; #(* % 2)

;; Output:
(= (#(* % 2) 2) 4)
(= (#(* % 2) 3) 6)
(= (#(* % 2) 11) 22)
(= (#(* % 2) 7) 14)

;; Explanation:
;; Uses an anonymous function, as denoted by the #. Takes one
;; argument, which will be referenced by the %. In each instance,
;; multiply the provided argument by 2.
;; Also could have been done as (fn [x] (* 2 x)).
;; See any of the function formats from the previous problem.
