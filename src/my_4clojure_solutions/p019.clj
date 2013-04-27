;; http://www.4clojure.com/problem/19

;; Last Element
;; Write a function which returns the last element in a sequence.

;; Special Restrictions:
;; last

;; (= (__ [1 2 3 4 5]) 5)
;; (= (__ '(5 4 3)) 3)
;; (= (__ ["b" "c" "d"]) "d")

;; Answer:
;; #(first (reverse %))

;; Output:
(= (#(first (reverse %)) [1 2 3 4 5]) 5)
(= (#(first (reverse %)) '(5 4 3)) 3)
(= (#(first (reverse %)) ["b" "c" "d"]) "d")

;; Explanation:
;; Clearly, the last function would be ideal, but we're not allowed to
;; use it.
;; As a workaround, use the reverse function, which reverses a
;; sequence, and then use the first function on that result. The first
;; element of the reversed sequence will be the last element of the
;; original sequence.

;; Also Works:

;; Answer:
#(nth % (- (count %) 1))

;; Output:
(= (#(nth % (- (count %) 1)) [1 2 3 4 5]) 5)
(= (#(nth % (- (count %) 1)) '(5 4 3)) 3)
(= (#(nth % (- (count %) 1)) ["b" "c" "d"]) "d")

;; Explanation:
;; The nth function returns the value at the index of a collection.
;; Use the count function to determine how many elements are in the
;; collection. Must subtract 1 from the count since nth is zero-based.
