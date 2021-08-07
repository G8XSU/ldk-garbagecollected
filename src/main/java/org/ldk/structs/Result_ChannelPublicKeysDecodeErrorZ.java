package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;
import javax.annotation.Nullable;

public class Result_ChannelPublicKeysDecodeErrorZ extends CommonBase {
	private Result_ChannelPublicKeysDecodeErrorZ(Object _dummy, long ptr) { super(ptr); }
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.CResult_ChannelPublicKeysDecodeErrorZ_free(ptr); } super.finalize();
	}

	static Result_ChannelPublicKeysDecodeErrorZ constr_from_ptr(long ptr) {
		if (bindings.LDKCResult_ChannelPublicKeysDecodeErrorZ_result_ok(ptr)) {
			return new Result_ChannelPublicKeysDecodeErrorZ_OK(null, ptr);
		} else {
			return new Result_ChannelPublicKeysDecodeErrorZ_Err(null, ptr);
		}
	}
	public static final class Result_ChannelPublicKeysDecodeErrorZ_OK extends Result_ChannelPublicKeysDecodeErrorZ {
		public final ChannelPublicKeys res;
		private Result_ChannelPublicKeysDecodeErrorZ_OK(Object _dummy, long ptr) {
			super(_dummy, ptr);
			long res = bindings.LDKCResult_ChannelPublicKeysDecodeErrorZ_get_ok(ptr);
			ChannelPublicKeys res_hu_conv = new ChannelPublicKeys(null, res);
			res_hu_conv.ptrs_to.add(this);
			this.res = res_hu_conv;
		}
	}

	public static final class Result_ChannelPublicKeysDecodeErrorZ_Err extends Result_ChannelPublicKeysDecodeErrorZ {
		public final DecodeError err;
		private Result_ChannelPublicKeysDecodeErrorZ_Err(Object _dummy, long ptr) {
			super(_dummy, ptr);
			long err = bindings.LDKCResult_ChannelPublicKeysDecodeErrorZ_get_err(ptr);
			DecodeError err_hu_conv = new DecodeError(null, err);
			err_hu_conv.ptrs_to.add(this);
			this.err = err_hu_conv;
		}
	}

	/**
	 * Creates a new CResult_ChannelPublicKeysDecodeErrorZ in the success state.
	 */
	public static Result_ChannelPublicKeysDecodeErrorZ ok(ChannelPublicKeys o) {
		long ret = bindings.CResult_ChannelPublicKeysDecodeErrorZ_ok(o == null ? 0 : o.ptr & ~1);
		if (ret < 1024) { return null; }
		Result_ChannelPublicKeysDecodeErrorZ ret_hu_conv = Result_ChannelPublicKeysDecodeErrorZ.constr_from_ptr(ret);
		ret_hu_conv.ptrs_to.add(o);
		return ret_hu_conv;
	}

	/**
	 * Creates a new CResult_ChannelPublicKeysDecodeErrorZ in the error state.
	 */
	public static Result_ChannelPublicKeysDecodeErrorZ err(DecodeError e) {
		long ret = bindings.CResult_ChannelPublicKeysDecodeErrorZ_err(e == null ? 0 : e.ptr & ~1);
		if (ret < 1024) { return null; }
		Result_ChannelPublicKeysDecodeErrorZ ret_hu_conv = Result_ChannelPublicKeysDecodeErrorZ.constr_from_ptr(ret);
		ret_hu_conv.ptrs_to.add(e);
		return ret_hu_conv;
	}

	/**
	 * Creates a new CResult_ChannelPublicKeysDecodeErrorZ which has the same data as `orig`
	 * but with all dynamically-allocated buffers duplicated in new buffers.
	 */
	public Result_ChannelPublicKeysDecodeErrorZ clone() {
		long ret = bindings.CResult_ChannelPublicKeysDecodeErrorZ_clone(this.ptr);
		if (ret < 1024) { return null; }
		Result_ChannelPublicKeysDecodeErrorZ ret_hu_conv = Result_ChannelPublicKeysDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

}
