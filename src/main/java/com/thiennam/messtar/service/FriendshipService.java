package com.thiennam.messtar.service;

import com.thiennam.messtar.entity.Friendship;
import com.thiennam.messtar.entity.User;

public interface FriendshipService {
    String NAME = "messtar_FriendshipService";

    void addFriend(User user1, User user2);

    Friendship findFriendship(User user1, User user2);
}
