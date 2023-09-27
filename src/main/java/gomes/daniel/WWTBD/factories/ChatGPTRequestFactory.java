package gomes.daniel.WWTBD.factories;

import gomes.daniel.WWTBD.client.model.ChatGPTQuery;

public interface ChatGPTRequestFactory {

    ChatGPTQuery createQuery(String value);
}
