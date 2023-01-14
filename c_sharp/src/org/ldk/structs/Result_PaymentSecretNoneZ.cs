using org.ldk.impl;
using org.ldk.enums;
using org.ldk.util;
using System;

namespace org { namespace ldk { namespace structs {

public class Result_PaymentSecretNoneZ : CommonBase {
	Result_PaymentSecretNoneZ(object _dummy, long ptr) : base(ptr) { }
	~Result_PaymentSecretNoneZ() {
		if (ptr != 0) { bindings.CResult_PaymentSecretNoneZ_free(ptr); }
	}

	internal static Result_PaymentSecretNoneZ constr_from_ptr(long ptr) {
		if (bindings.CResult_PaymentSecretNoneZ_is_ok(ptr)) {
			return new Result_PaymentSecretNoneZ_OK(null, ptr);
		} else {
			return new Result_PaymentSecretNoneZ_Err(null, ptr);
		}
	}
	public class Result_PaymentSecretNoneZ_OK : Result_PaymentSecretNoneZ {
		public readonly byte[] res;
		internal Result_PaymentSecretNoneZ_OK(object _dummy, long ptr) : base(_dummy, ptr) {
			this.res = bindings.CResult_PaymentSecretNoneZ_get_ok(ptr);
		}
	}

	public class Result_PaymentSecretNoneZ_Err : Result_PaymentSecretNoneZ {
		internal Result_PaymentSecretNoneZ_Err(object _dummy, long ptr) : base(_dummy, ptr) {
		}
	}

	/**
	 * Creates a new CResult_PaymentSecretNoneZ in the success state.
	 */
	public static Result_PaymentSecretNoneZ ok(byte[] o) {
		long ret = bindings.CResult_PaymentSecretNoneZ_ok(InternalUtils.check_arr_len(o, 32));
		GC.KeepAlive(o);
		if (ret >= 0 && ret <= 4096) { return null; }
		Result_PaymentSecretNoneZ ret_hu_conv = Result_PaymentSecretNoneZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	/**
	 * Creates a new CResult_PaymentSecretNoneZ in the error state.
	 */
	public static Result_PaymentSecretNoneZ err() {
		long ret = bindings.CResult_PaymentSecretNoneZ_err();
		if (ret >= 0 && ret <= 4096) { return null; }
		Result_PaymentSecretNoneZ ret_hu_conv = Result_PaymentSecretNoneZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	/**
	 * Checks if the given object is currently in the success state
	 */
	public bool is_ok() {
		bool ret = bindings.CResult_PaymentSecretNoneZ_is_ok(this.ptr);
		GC.KeepAlive(this);
		return ret;
	}

	internal long clone_ptr() {
		long ret = bindings.CResult_PaymentSecretNoneZ_clone_ptr(this.ptr);
		GC.KeepAlive(this);
		return ret;
	}

	/**
	 * Creates a new CResult_PaymentSecretNoneZ which has the same data as `orig`
	 * but with all dynamically-allocated buffers duplicated in new buffers.
	 */
	public Result_PaymentSecretNoneZ clone() {
		long ret = bindings.CResult_PaymentSecretNoneZ_clone(this.ptr);
		GC.KeepAlive(this);
		if (ret >= 0 && ret <= 4096) { return null; }
		Result_PaymentSecretNoneZ ret_hu_conv = Result_PaymentSecretNoneZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

}
} } }
