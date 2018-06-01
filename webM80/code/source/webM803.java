

// -----( IS Java Code Template v1.2
// -----( CREATED: 2009-05-28 17:24:27 GMT+05:30
// -----( ON-HOST: VMKSG1

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class webM803

{
	// ---( internal utility methods )---

	final static webM803 _instance = new webM803();

	static webM803 _newInstance() { return new webM803(); }

	static webM803 _cast(Object o) { return (webM803)o; }

	// ---( server methods )---




	public static final void SampleJavaService (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(SampleJavaService)>> ---
		// @sigtype java 3.5
		// [i] field:0:required msg
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	Untitled = IDataUtil.getString( pipelineCursor, "Untitled" );
		pipelineCursor.destroy();
		
		// pipeline
			
		// --- <<IS-END>> ---

                
	}
}

