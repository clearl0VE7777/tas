package org.tian.tas.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 
 * @TableName score
 */
@TableName(value ="score")
@Data
@NoArgsConstructor
public class Score implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 课程编号
     */
    private String courseNum;

    /**
     * 学生学号
     */
    private Integer studentNum;

    /**
     * 分数
     */
    private Double num;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public Score(String courseNum, Integer studentNum, Double num) {
        this.courseNum = courseNum;
        this.studentNum = studentNum;
        this.num = num;
    }
}