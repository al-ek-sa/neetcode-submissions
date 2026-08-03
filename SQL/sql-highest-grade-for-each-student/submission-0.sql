-- Write your query below
WITH max_score AS(
    SELECT student_id, exam_id, score,
    ROW_NUMBER() 
    OVER(PARTITION BY student_id ORDER BY score DESC, exam_id) row_num
    FROM exam_results
)
SELECT student_id, exam_id, score 
FROM max_score
WHERE row_num = 1
ORDER BY student_id