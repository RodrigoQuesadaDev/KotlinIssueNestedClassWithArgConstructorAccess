package a

import javax.inject.Inject

/**
 * Created by Rodrigo Quesada on 22/09/15.
 */
internal class A @Inject constructor() {

    inner class C(value: String)
}
