package com.js.jsoj.judge.codesandbox.impl;

import com.js.jsoj.judge.codesandbox.CodeSandBox;
import com.js.jsoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.js.jsoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * @author JianShang
 * @version 1.0.0
 * @time 2024-10-24 11:18:48
 */
public class RemoteCodeSandBox implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest excecuteCodeRequest) {
        System.out.println("远程代码沙箱");
        return null;
    }
}
