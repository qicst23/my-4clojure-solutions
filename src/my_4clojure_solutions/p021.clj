;; http://www.4clojure.com/problem/21

;; Nth Element
;; Write a function which returns the Nth element from a sequence.

;; Special Restrictions:
;; nth

;; (= (__ '(4 5 6 7) 2) 6)
;; (= (__ [:a :b :c] 0) :a)
;; (= (__ [1 2 3 4] 1) 2)
;; (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])

;; Answer:
(fn [coll n] (if (zero? n) (first coll) (recur (rest coll) (- n 1))))

;; Output:
(= ((fn [coll n] (if (zero? n) (first coll) (recur (rest coll) (- n 1)))) '(4 5 6 7) 2) 6)
(= ((fn [coll n] (if (zero? n) (first coll) (recur (rest coll) (- n 1)))) [:a :b :c] 0) :a)
(= ((fn [coll n] (if (zero? n) (first coll) (recur (rest coll) (- n 1)))) [1 2 3 4] 1) 2)
(= ((fn [coll n] (if (zero? n) (first coll) (recur (rest coll) (- n 1)))) '([1 2] [3 4] [5 6]) 2) [5 6])

;; Explanation:
;; At first I didn't think this was a good solution, as it was the
;; first of the 4Clojure problems that used recursion. I thought there
;; must be a simpler way. But I am going to stick with this.
;; The anonymous function takes 2 arguments. A collection (coll), and the
;; index position of the element to return (n). If n is 0, return the
;; first element of the collection. Otherwise, use recur to
;; recursively call the anonymous function passing the rest of the
;; collection and n - 1.
;; It's also possible to name the anonymous function and call it
;; explicitly recursively. But using recur provides tail call
;; optimization, and according to the docs, if the recursion is in
;; tail position, is encouraged in clojure. That function would look like:
;; (fn my-nth [coll n] (if (zeron? n) (first coll) (my-nth (rest coll) (-n 1))))

