;; http://www.4clojure.com/problem/17

;; Sequences: map
;; The map function takes two arguments: a function (f) and a sequence (s). Map returns a new sequence consisting of the result of applying f to each item of s. Do not confuse the map function with the map data structure.

;; (= __ (map #(+ % 5) '(1 2 3)))

;; Answer:
;; '(6 7 8)

;; Output:
(= '(6 7 8) (map #(+ % 5) '(1 2 3)))

;; Explanation:
;; The function passed to map is an anonymous function that takes a
;; single argument and increments it by 5, or adds 5. 
;; Given the list/sequence '(1 2 3), each element is incremented by 5, 
;; resulting in a new list/sequence of '(6 7 8).

