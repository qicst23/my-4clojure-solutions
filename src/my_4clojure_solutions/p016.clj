;; http://www.4clojure.com/problem/16

;; Double Down
;; Write a function which returns a personalized string.

;; (= (__ "Dave") "Hello, Dave!")
;; (= (__ "Jenn") "Hello, Jenn!")
;; (= (__ "Rhea") "Hello, Rhea!")

;; Answer:
;; #(str "Hello, " % "!")

;; Output:
(= (#(str "Hello, " % "!") "Dave") "Hello, Dave!")
(= (#(str "Hello, " % "!") "Jenn") "Hello, Jenn!")
(= (#(str "Hello, " % "!") "Rhea") "Hello, Rhea!")

;; Explanation:
;; Uses an anonymous function, as denoted by the #. Takes one
;; argument, which will be referenced by the %. In each instance,
;; use clojure's str function to concatenate the literal text with the
;; supplied argument ("Dave", "Jenn", or "Rhea").

