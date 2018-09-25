package com.rongji.dubbo.filter;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.RpcResult;

public class AuthorityFilter implements Filter {

	private List<String> ipWhitleList = Arrays.asList(new String[] { "192.168.212.11", "192.168.212.78" });

	public static final Log LOG = LogFactory.getLog(AuthorityFilter.class);

	public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
		String clientIp = RpcContext.getContext().getRemoteHost();
		LOG.info("Entry AuthorityFilter & 访问ip" + clientIp);
		if (ipWhitleList.contains(clientIp)) {
			return invoker.invoke(invocation);
		} else {
			return new RpcResult();
		}

	}

}
