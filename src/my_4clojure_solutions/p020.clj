;; http://www.4clojure.com/problem/20

;; Penultimate Element
;; Write a function which returns the second to last element from a sequence.

;; (= (__ (list 1 2 3 4 5)) 4)
;; (= (__ ["a" "b" "c"]) "b")
;; (= (__ [[1 2] [3 4]]) [1 2])

;; Answer:
;; #(second (reverse %))

;; Output:
(= (#(second (reverse %)) (list 1 2 3 4 5)) 4)
(= (#(second (reverse %)) ["a" "b" "c"]) "b")
(= (#(second (reverse %)) [[1 2] [3 4]]) [1 2])

;; Explanation:
;; Same solution as problem 19, with one small change.
;; Rather than looking for the last element, we're looking for the penultimate.
;; Still reverse the sequence, but rather than calling first, call second.
;; The second element of the reversed sequence is the same as the
;; penultimate element of the original sequence.

;; Also Works:

;; Answer:
#(nth % (- (count %) 2))

;; Output:
(= (#(nth % (- (count %) 2)) (list 1 2 3 4 5)) 4)
(= (#(nth % (- (count %) 2)) ["a" "b" "c"]) "b")
(= (#(nth % (- (count %) 2)) [[1 2] [3 4]]) [1 2])

;; Explanation:
;; The nth function returns the value at the index of a collection.
;; Use the count function to determine how many elements are in the
;; collection. Must subtract 2 from the count since nth is zero-based.
