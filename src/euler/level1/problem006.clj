(ns euler.level1.problem006)

(defn sum-squares-up-to [limit]
  (reduce + (map #(int (Math/pow % 2)) (range 1 (inc limit)))))

(defn square-sums-up-to [limit]
  (let [sum (reduce + (range 1 (inc limit)))]
    (int (Math/pow sum 2))))

(defn euler-6 [n]
  (- (square-sums-up-to n) (sum-squares-up-to n)))

