;; http://www.4clojure.com/problem/3

;; Intro to Strings
;; Clojure strings are Java strings. This means that you can use any of the Java string methods on Clojure strings.

;; (= ___ (.toUpperCase "hello world"))

;; Answer:
;; "HELLO WORLD"

;; Output:
(= "HELLO WORLD" (.toUpperCase "hello world"))

;; Explanation:
;; toUpperCase() is a Java method that converts a string to its
;; uppercase equivalent. Native java methods are invoked by calling
;; them preceded with a dot character. Notice no need for () following
;; the method call.
