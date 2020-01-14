package com.azure.android.core.util.tokenrequest;

import androidx.lifecycle.Observer;

import com.azure.android.core.credential.AccessToken;

/**
 * An Observer of {@link TokenRequestObservable}.
 */
public abstract class TokenRequestObserver implements Observer<TokenRequestHandle> {
    @Override
    public final void onChanged(TokenRequestHandle requestHandle) {
        if (!requestHandle.isConsumed()) {
            this.onTokenRequest(requestHandle.getScopes().toArray(new String[0]), new TokenResponseCallback() {
                @Override
                public void onToken(AccessToken token) {
                    requestHandle.setToken(token);
                }

                @Override
                public void onError(Throwable t) {
                    requestHandle.setError(t);
                }
            });
        }
    }

    /**
     * Invoked when {@link TokenRequestObservable} emits a token request event.
     *
     * @param scopes the scope of the requested token
     * @param callback the callback that this observer use to notify the result
     *                 of token retrieval
     */
    public abstract void onTokenRequest(String[] scopes, TokenResponseCallback callback);
}
