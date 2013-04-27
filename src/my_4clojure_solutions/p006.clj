;; http://www.4clojure.com/problem/6

;; Intro to Vectors
;; Vectors can be constructed several ways. You can compare them with lists.

;; (= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))

;; Answer:
;; :a :b :c

;; Output
(= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))

;; Explanation:
;; The vector [:a :b :c] is equivalent to the list '(:a :b :c), or
;; (list :a :b :c). Both (vec '(:a :b :c)) and (vector :a :b :c) are
;; simply two different means towards creating the same vector.
