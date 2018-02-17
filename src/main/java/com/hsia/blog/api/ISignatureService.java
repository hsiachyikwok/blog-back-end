package com.hsia.blog.api;

import com.hsia.blog.entity.Signature;

import java.util.List;

/**
 * @author: hsia
 * @Date: 2018/2/17 下午10:36
 * @Description:
 */
public interface ISignatureService {
    /**
     * 新增标签
     * @param signature
     */
    void addSignature(Signature signature);

    /**
     * 更新标签
     * @param signature
     */
    void updateSignature(Signature signature);

    /**
     * 查询标签
     * @return
     */
    List<Signature> listSignature();

    /**
     * 删除标签
     * @param id
     */
    void deleteSignature(String id);
}
