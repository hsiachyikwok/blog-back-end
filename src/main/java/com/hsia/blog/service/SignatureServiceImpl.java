package com.hsia.blog.service;

import com.hsia.blog.api.ISignatureService;
import com.hsia.blog.entity.Signature;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: hsia
 * @Date: 2018/2/17 下午10:39
 * @Description:
 */
@Slf4j
@Service
public class SignatureServiceImpl implements ISignatureService{
    @Override
    public void addSignature(Signature signature) {

    }

    @Override
    public void updateSignature(Signature signature) {

    }

    @Override
    public List<Signature> listSignature() {
        return null;
    }

    @Override
    public void deleteSignature(String id) {

    }
}
