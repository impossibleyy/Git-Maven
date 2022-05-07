package com.bjpowernode;

import junit.framework.Assert;
import org.junit.Test;

public class TestGitTest01 {
    @Test
    public void testAdd() {
        GitTest01 gitTest01 = new GitTest01();
        int add = gitTest01.add(100, 200);
        Assert.assertEquals(add,300);

    }

}
