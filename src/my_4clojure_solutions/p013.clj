;; http://www.4clojure.com/problem/13

;; Sequences: rest
;; The rest function will return all the items of a sequence except the first.

;; (= __ (rest [10 20 30 40]))

;; Answer:
;; '(20 30 40)

;; Output:
(= '(20 30 40) (rest [10 20 30 40]))

;; Explanation:
;; Fairly self-explanatory uses of rest.
;; Note that (rest {:a 10 :b 20 :c 30 :d 40}) returns a list of the
;; rest of the pairs in the map. In this case, '([:b 20] [:c 30] [:d 40])
