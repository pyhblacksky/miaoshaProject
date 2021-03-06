package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.UserPasswordDO;
import org.springframework.stereotype.Service;

@Service
public interface UserPasswordDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Fri May 03 21:03:39 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Fri May 03 21:03:39 CST 2019
     */
    int insert(UserPasswordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Fri May 03 21:03:39 CST 2019
     */
    int insertSelective(UserPasswordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Fri May 03 21:03:39 CST 2019
     */
    UserPasswordDO selectByPrimaryKey(Integer id);

    /**
     * 根据用户id查找对应密码
     * */
    UserPasswordDO selectByUserId(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Fri May 03 21:03:39 CST 2019
     */
    int updateByPrimaryKeySelective(UserPasswordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Fri May 03 21:03:39 CST 2019
     */
    int updateByPrimaryKey(UserPasswordDO record);
}