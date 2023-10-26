import { add, subs } from "../src/utils";
import { jest } from '@jest/globals';

test('Addition test', () => {
    expect(add(2, 3)).toBe(5);
});


test('substraction test', () => {
    expect(subs(2, 3)).toBe(1);
});