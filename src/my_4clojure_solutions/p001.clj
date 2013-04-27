;; http://www.4clojure.com/problem/1

;; Nothing but the Truth
;; This is a clojure form. Enter a value which will make the form evaluate to true.

;; (= ___ true)

;; Answer:
;; true

;; Output:
(= true true)

;; Explanation:
;; true equals itself. Clojure does not do implicit boolean conversion.
;; (= 1 true) ;false
;; (= "true" true) ;false
;; In order to coerce a non-boolean value to a boolean value, use (boolean)
;; (= (boolean 1) true) ;true
;; (= (bolean "true") true) ;true
;; (= (boolean nil) true) ;false
;; All values are truthy except for nil.
